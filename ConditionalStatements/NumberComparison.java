package ConditionalStatements;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer x = scanner.nextInt();

        System.out.println("Enter another number: ");
        Integer y = scanner.nextInt();

        if (x == y) {
            System.out.println("The numbers are the same.");
        } else if (x > y) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }

        scanner.close();
    }
}
