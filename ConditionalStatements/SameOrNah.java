package ConditionalStatements;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String first = scanner.nextLine();
        System.out.println("Enter another word:");
        String second = scanner.nextLine();

        if (first.equalsIgnoreCase(second)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
        scanner.close();
    }
}
