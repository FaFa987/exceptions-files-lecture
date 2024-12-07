package se.lexicon;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Supplier;

public class ExceptionExamples {
    public static void main(String[] args) {

        // Unchecked (Runtime) Exception
//        int[] number = {1,2,3,4,5};
//        System.out.println(number[10]);


        // Checked (Compile Time) Exception
//        Path filePath = Paths.get("folder/TestHere.txt");
//        BufferedReader reader = Files.newBufferedReader(filePath);

        LocalDate localDate = takeDate.get();
        System.out.println(localDate);

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

    public static void ex2(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your birthDate (YYYY-MM-DD): ");

            try {
                String input = scanner.nextLine();
                LocalDate date = LocalDate.parse(input);
                System.out.println(date);

            }catch (DateTimeException e) {
                // e.printStackTrace();
                System.out.println("Invalid date format. Please enter date in yyyy-mm-dd format. " + e.getMessage());
            }
        }
        }

    public static Supplier<LocalDate> takeDate = () -> {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = null;

        while (true) {
            System.out.println("Enter your birthDate (YYYY-MM-DD): ");

            try {
                String input = scanner.nextLine();
                date = LocalDate.parse(input);
                break;

            }catch (DateTimeException e) {
                // e.printStackTrace();
                System.out.println("Invalid date format. Please enter date in yyyy-mm-dd format. " + e.getMessage());
            }
        }
        return date;
    };



    }
