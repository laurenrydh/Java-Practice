package LoopsPractice;

import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int number = 1; number != 0; ) {
            System.out.println("Enter a number:");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Number must be a positive number.");
            } else if (number > 0) {
                System.out.println("Number is " + number);
            }
        }
        System.out.println("0 was entered. Program stopping. Goodbye");
        scanner.close();
    }
}
