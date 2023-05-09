package Calculations;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer x = scanner.nextInt();

        System.out.println("Enter another number: ");
        Integer y = scanner.nextInt();

        //addition
        System.out.println(x + " + " + y + " = " + (x + y));

        //subtraction
        System.out.println(x + " - " + y + " = " + (x - y));


        //Multiplication
        System.out.println(x + " * " + y + " = " + (x * y));


        //Division(float/double)
        System.out.println(x + " / " + y + " = " + ((double) x / y));

        //Modulus
        System.out.println(x + " % " + y + " = " + (x % y));

        scanner.close();
    }
}

