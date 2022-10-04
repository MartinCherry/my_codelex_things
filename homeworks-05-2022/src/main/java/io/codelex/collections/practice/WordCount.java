package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        String[] lines = Files.readString(path, charset).split("\n");
        System.out.println("Lines = " + lines.length);
        String[] words = Files.readString(path, charset).replaceAll("[ ]+", "%").split("[%'\n]");
        System.out.println("Words = " + words.length);
        String chars = Files.readString(path, charset).replaceAll("['!]", "");


        System.out.println("Chars = " + chars.length());


    }
}
