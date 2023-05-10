package ArraysLists;

import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings, empty string to quit:");
        String newItem = scanner.nextLine();
        while (!newItem.isEmpty()) {
            inputs.add(newItem);
            newItem = scanner.nextLine();
        }

        int size = inputs.size();
        System.out.println("The total number of items in the list was: " + size);

        scanner.close();
    }
}
