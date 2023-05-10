package ArraysLists;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Input Strings, empty string to quit:");

        String newItem = scanner.nextLine();
        while (!newItem.isEmpty()) {
            inputs.add(newItem);
            newItem = scanner.nextLine();

        }
        if (inputs.size() >= 5) {
            String fifthItem = inputs.get(4);
            System.out.println("The fifth item in the list is: " + fifthItem);
        }
        scanner.close();
    }
}
