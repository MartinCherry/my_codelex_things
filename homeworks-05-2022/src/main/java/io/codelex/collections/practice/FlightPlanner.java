package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner in = new Scanner(System.in);

        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        String[] rawData = getData(path, charset);
        List<String> trip = new ArrayList<>();

        Map<String, List<String>> flightDB = getFlightDB(rawData);

        System.out.println("All our from cities we are flying from: ");
        System.out.println(flightDB.keySet());

        String startCity = "";
        String stop = "";
        String destination = "";

        while (true) {
            System.out.println("Please, enter city to start from: ");
            String from = in.nextLine();
            if (flightDB.containsKey(from)) {
                startCity = from;
                stop = from;
                trip.add(from);
                System.out.println("You entered " + startCity);
                System.out.println("You can fly to " + flightDB.get(startCity));
                break;
            }
            else {
                System.out.println("Sorry. We don't have flight from " + from);
            }
        }

        while (true) {
            System.out.println("What city do you chose?");
            String to = in.nextLine();
            System.out.println("You entered " + to);
            if (startCity.equals(to)) {
                trip.add(to);
                break;
            }
            boolean foundConnection = false;
            for (String toCity : flightDB.get(stop)) {
                if (toCity.equals(to)) {
                    System.out.println("Connection found. You can fly to " + to);
                    System.out.println("You can fly to " + flightDB.get(to));
                    trip.add(to);
                    stop = to;
                    foundConnection = true;
                    break;
                }
            }
            if (!foundConnection) {
                System.out.println("Sorry. No connections to " + to);
            }

        }
        System.out.println("You are back home");
        System.out.println("Your trip is " + String.join("->", trip));


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

    private static Map<String, List<String>> getFlightDB(String[] dbData) {
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


}
