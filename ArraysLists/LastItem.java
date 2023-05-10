package ArraysLists;

import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input strings, empty string to stop:");
        String newItem = scanner.nextLine();
        while (!newItem.isEmpty()) {
            inputs.add(newItem);
            newItem = scanner.nextLine();
        }

        if (!inputs.isEmpty()) {
            String lastItem = inputs.get(inputs.size() - 1);
            System.out.println("The last item in the list was: " + lastItem);
        }
        scanner.close();
    }
}
