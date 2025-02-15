package com.week4.day4;

import java.io.*;
import java.util.*;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "data.txt";

        // Try to read the file
        try {
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            // Read and print the file contents
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            // Handle the case where the file does not exist
            System.out.println("File not found");
        } catch (IOException e) {
            // Handle other IO exceptions
            System.out.println("An error occurred while reading the file");
        }

        // Handle division operation with exception handling
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}

