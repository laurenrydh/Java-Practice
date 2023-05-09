package Scanner;

import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello There! How are you doing today?");
        scanner.nextLine();
        System.out.println("Wow - Interesting. Tell me more about yourself!");
        scanner.nextLine();
        System.out.println("Nice chatting with you! Goodbye!");
        scanner.close();
    }
}
