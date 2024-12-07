package se.lexicon;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionExamples {
    public static void main(String[] args) {

        // Unchecked (Runtime) Exception
        // int[] numbers = {1, 2, 3, 4, 5};
        // System.out.println(numbers[10]);

        // Checked (Compile Time) Exception
        Path filePath = Paths.get("folder/TextHere.txt");
        BufferedReader reader = Files.newBufferedReader(filePath);


    }
}
