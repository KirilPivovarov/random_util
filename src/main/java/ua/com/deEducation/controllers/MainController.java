package ua.com.deEducation.controllers;

import ua.com.deEducation.randomizer.Randomizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainController {

    private final Scanner scanner = new Scanner(System.in);
    private final Randomizer randomizer = new Randomizer();

    public void run() {
            System.out.println("Hello in randomizer! Choose your option:");
            boolean startProgram = true;
            while (startProgram) {
                System.out.println("""
                        Generate - 1
                        Help - 2
                        Exit - 0""");

                String choose = "";

                choose = scanner.nextLine();

                switch (choose) {
                    case "1" -> {
                        boolean startRandom = true;
                        System.out.println("Randomizer:");
                        int from = 0;
                        int to = 100;
                        while (startRandom) {
                            System.out.println("Default boundaries from: 0, to: 100");
                            System.out.println("If you want to enter new boundaries enter 1 if a new number then n and 0 for exit");
                            String newNumber = "";
                            newNumber = scanner.nextLine();
                            switch (newNumber) {
                                case "1" -> {
                                    try {
                                        System.out.println("Enter your boundaries:");
                                        System.out.print("from: ");
                                        from = scanner.nextInt();
                                        System.out.print("to: ");
                                        to = scanner.nextInt();
                                        System.out.println("Your randomizer:" + randomizer.getYourRandomNumber(from, to));
                                    } catch (InputMismatchException e) {
                                        System.out.println("You must enter a number");
                                    }
                                }
                                case "n" -> {
                                    System.out.println("Your randomizer:" + randomizer.getYourRandomNumber(from, to));
                                }
                                case "0" -> startRandom = false;
                            }
                        }

                    }
                    case "2" -> System.out.println("""
                            Help:
                            This program outputs random numbers every time the user enters "n" or "0" to exit
                            Example:
                            Enter your boundaries:
                            from: 1
                             to: 100
                            Your random number: 3
                            If you want to enter new boundaries enter 1 if a new number then "n" and 0 for exit
                            Your choose: n
                            Your random number: 45
                            If you want to enter new boundaries enter 1 if a new number then "n" and 0 for exit
                            Your choose: 0
                            Goodbye!

                            """);
                    case "0" -> {
                        System.out.println("Are you sure that you want to quit the app?(yes or no)”");
                        String finalChoose = scanner.nextLine();
                        if (finalChoose.equals("yes")) {
                            startProgram = false;
                            System.out.println("Goodbye!");
                        }
                    }
                }
            }
    }
}
