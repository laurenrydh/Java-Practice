package LoopsPractice;

import java.util.Scanner;
public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        while (!response.equalsIgnoreCase("yes")) {
            System.out.println("Do you want to take a break? ");
            response = scanner.nextLine();
        }
        scanner.close();
    }
}
