package Scanner;

import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String heroName = scanner.nextLine();
        System.out.println("What is their superpower?");
        String superPower = scanner.nextLine();
        System.out.println("Here is the story");
        System.out.println("There once was a superhero named " + heroName + ", who had the power of " + superPower + ".");
        System.out.println("As they grew older, " + heroName + " saw that the world needed them.");
        System.out.println(heroName + " used their ability of " + superPower + " to save the world.");
        scanner.close();
    }
}
