package ConditionalStatements;

import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100:");
        int grade = scanner.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("Your grade is an A!");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("Your grade is a B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Your grade is a C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Your grade is a D");
        } else if (grade <= 59) {
            System.out.println("Your grade is an F :(");
        } else {
            System.out.println("That is not a score, try again.");
        }
        scanner.close();
    }
}
