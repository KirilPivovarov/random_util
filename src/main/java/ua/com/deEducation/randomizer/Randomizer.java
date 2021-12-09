package ua.com.deEducation.randomizer;

import java.util.Random;
import java.util.Scanner;

public class Randomizer {
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    public int getYourRandomNumber(int firstNumber, int lastNumber) {
        if (lastNumber > 500 || firstNumber < 0) {
            System.out.println("Incorrect input.");
            return 0;
        }
        if (firstNumber > lastNumber) {
            int i = lastNumber;
            lastNumber = firstNumber;
            firstNumber = i;
        }
        int diff = lastNumber - firstNumber;
        int randomNumber = random.nextInt(diff + 1);
        return randomNumber + firstNumber;
    }

}
