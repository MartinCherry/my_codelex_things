package io.codelex.secondtest.exercise4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class Exercise4 {

    private static final String PATH = "/Users/martinskirsis/Documents/FolderForTest/";
    private static final String EXTENSION = ".txt";

    public static void main(String[] args) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        String inputFile = "oldFile";
        String outputFile = stringBuilder.append(inputFile).reverse().toString();


        System.out.println(outputFile);


            BufferedReader in = new BufferedReader(new FileReader(PATH + inputFile + EXTENSION));
        Path path = Paths.get(PATH+outputFile+EXTENSION);
        Files.createFile(path);
            BufferedWriter out = new BufferedWriter(new FileWriter(PATH + outputFile + EXTENSION));

            StringBuilder documentText = new StringBuilder();

        String line;
        while ((line = in.readLine()) != null) {
            documentText.append(line);
            documentText.append("\n");
        }

            out.write(documentText.reverse().toString());

        in.close();
        out.close();

    }
}
