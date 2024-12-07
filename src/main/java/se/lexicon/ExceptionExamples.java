package se.lexicon;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ExceptionExamples {
    public static void main(String[] args) {

        // Unchecked (Runtime) Exception
//        int[] number = {1,2,3,4,5};
//        System.out.println(number[10]);


        // Checked (Compile Time) Exception
//        Path filePath = Paths.get("folder/TestHere.txt");
//        BufferedReader reader = Files.newBufferedReader(filePath);

        ex1();

    }

    public static void ex1(){

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a score between 1-100: ");

            try {

                int score = Integer.parseInt(scanner.nextLine());

                if (score >= 101) {
                    System.out.println("You scored " + score + " Score should be maximum 100");
                } else if (score <= 0) {
                    System.out.println("You scored " + score + " should not be zero or negative");
                }

            }catch (NumberFormatException e){
                System.out.println("Enter a valid number: ");
                //e.printStackTrace();
            }
        }



    }
}
