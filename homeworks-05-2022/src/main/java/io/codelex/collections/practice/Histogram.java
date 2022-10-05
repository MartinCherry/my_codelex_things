package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        List<String> scoresList = Arrays.stream(scores.split(" ")).toList();
        List<Integer> pointsArray = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            pointsArray.add(0);
        }
        for (String score : scoresList) {
            int position = Integer.parseInt(score) / 10;
            int temp = pointsArray.get(position) + 1;
            pointsArray.set(position, temp);
        }
        for (int i = 0; i < 11; i++) {
            String label = "";
            String points = "*".repeat(pointsArray.get(i));
            switch (i) {
                case 0:
                    label = "00-09";
                    break;
                case 10:
                    label = "  100";
                    break;
                default:
                    label = (10 * i) + "-" + (10 * i + 9);
                    break;
            }

            System.out.println(label + ": " + points);
        }
    }


    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
