package Chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        ChatBot bot = new ChatBot();
        bot.getGreeting();
        String name = bot.getName();
        bot.repeatName(name);
        bot.getGenerationQuestion();
        bot.countNumbers();
        bot.testProgrammingKnowledge();
    }

    public void getGreeting() {
        System.out.println("Hello! Nice to meet you!");
    }

    public String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        return name;
    }

    public void repeatName(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Just to be sure I have that right, can you repeat your name?");
        String repeatedName = scanner.nextLine();
        if(repeatedName.equalsIgnoreCase(name)){
            System.out.println("Great, " + repeatedName + "! Anyways...");
        } else {
            System.out.println("That was not a match, but continuing on...");
        }
    }

    public void getGenerationQuestion() {
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        System.out.println("Which generation are you part of?");
        System.out.println("Baby Boomer");
        System.out.println("Gen X");
        System.out.println("Millennial");
        System.out.println("Gen Z");

        System.out.print("Please enter your generation: ");
        userAnswer = scanner.nextLine().toUpperCase();

        if (userAnswer.equals("BABY BOOMER")) {
                    System.out.println("So you might be between 57 and 75 years old. Let's try to guess your exact age!");
            guessAge(57, 75);
        } else if (userAnswer.equals("GEN X")) {
            System.out.println("So you might be between 41 and 56 years old. Let's try to guess your exact age!");
            guessAge(41, 56);
        } else if (userAnswer.equals("MILLENNIAL")) {
            System.out.println("So you might be between 25 and 40 years old. Let's try to guess your exact age!");
            guessAge(25, 40);
        } else if (userAnswer.equals("GEN Z")) {
            System.out.println("So you might be between 9 and 24 years old. Let's try to guess your exact age!");
            guessAge(9, 24);
        } else {
            System.out.println("Invalid response. Please check your spelling and start over.");
        }
    }

    public void guessAge(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        for(int i = start; i <= end; i++) {
            System.out.println("Are you " + i + " years old? (yes/no)");
            userAnswer = scanner.nextLine().toLowerCase();
            if(userAnswer.equals("yes")) {
                System.out.println("Great! I've guessed your age correctly!");
                break;
            }
        }
    }
    public void countNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Now let's count together! What is your favorite number?: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public void testProgrammingKnowledge() {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("What two words does every programmer learn to print first?: ");
            System.out.println("1. Hello, World");
            System.out.println("2. What's up?");
            System.out.println("3. Stack Overflow");
            System.out.println("4. I'm Programming");
            System.out.print("Please enter the number of the correct answer: ");
            answer = scanner.nextLine();
        } while (!"1".equals(answer));
        System.out.println("Correct! Now goodbye, World!");
    }
}