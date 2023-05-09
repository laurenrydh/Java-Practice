package LoopsPractice;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = number * i; 
            System.out.println(number + " * " + i + " = " + product);
        }
        scanner.close();
    }
}
