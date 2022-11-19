package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlannerConnectionPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner in = new Scanner(System.in);
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());

        Map<String, List<String>> flightDB = getFlightDB(path, charset);

        System.out.println("All our from cities we are flying from: ");
        System.out.println(flightDB.keySet());
        System.out.println("Please chose your city to fly from: ");
        String inputFrom = in.nextLine();
        System.out.println("You entered: " + inputFrom + ". From this airport you can fly to: " + flightDB.get(inputFrom));
        System.out.println("Where would you like to fly to?");
        String inputTo = in.nextLine();
        System.out.println(findConnections(flightDB, inputFrom, inputTo));
    }


    private static String[] getData(Path path, Charset charset) {
        String[] cityLines = null;
        try {
            cityLines = Files.readString(path, charset).split("\n");
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }
        return cityLines;
    }

    private static Map<String, List<String>> getFlightDB(Path path, Charset charset) {
        String[] dbData = getData(path, charset);
        Map<String, List<String>> routeDB = new HashMap<>();
        for (String flight : dbData) {
            String[] route = flight.split("->");
            String from = route[0].trim();
            String to = route[1].trim();
            if (routeDB.containsKey(from)) {
                List<String> newList = new ArrayList<>(routeDB.get(from));
                newList.add(to);
                routeDB.put(from, newList);
            }
            else {
                routeDB.put(from, List.of(to));
            }

        }
        return routeDB;

    }

    private static String findFlight(Map<String, List<String>> db, String from, String to) {
        boolean founConnnection = false;
        String output = "";
        for (String destination : db.get(from)) {
            if (destination.equals(to)) {
                output = "We found it.";
                founConnnection = true;
                break;
            }
        }
        if (founConnnection) {
            output = "You can fly from " + from + " to " + to + " with direct flight.";
        }
        else {
            output = "Sorry! We don't have direct flights from " + from + " to " + to;
        }

        return output;
    }

    private static String findConnections(Map<String, List<String>> db, String from, String to) {
        String start = from;
        String end = to;
        List<String> stops = new ArrayList<>();
        boolean foundConnection = false;
        while (!foundConnection) {
            for (String destinations : db.get(from)) {
                if (destinations.equals(to)) {
                    foundConnection = true;
                    stops.add(destinations);
                    return "We found connection! " + from + "->" + String.join("->", stops);
                }
                for (String destinationTwo : db.get(destinations)) {

                    if (destinationTwo.equals(to)) {
                        stops.add(destinations);
                        foundConnection = true;
                        stops.add(destinationTwo);
                        return "We found connection! " + from + "->" + String.join("->", stops);
                    }
                    for (String destinationThree : db.get(destinationTwo)) {

                        if (destinationThree.equals(to)) {
                            stops.add(destinations);
                            stops.add(destinationTwo);
                            foundConnection = true;
                            stops.add(destinationThree);
                            return "We found connection! " + from + "->" + String.join("->", stops);
                        }
                    }
                }
            }
        }
        return "We found connection! " + from + "->" + String.join("->", stops);
    }

}
