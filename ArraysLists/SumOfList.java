package ArraysLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myNumbers = new ArrayList<>();

        System.out.println("Enter integers to add to the list. Enter 0 to finish.");

        while (true) {
            int userInput = scanner.nextInt();

            if (userInput == 0) {
                break;
            }

            myNumbers.add(userInput);
        }

        int totalSum = getSum(myNumbers);

        StringBuilder listItems = new StringBuilder();
        for (int i = 0; i < myNumbers.size(); i++) {
            if (i == myNumbers.size() - 1) {
                listItems.append("and ").append(myNumbers.get(i));
            } else {
                listItems.append(myNumbers.get(i)).append(", ");
            }
        }

        System.out.println(listItems + " were items in the list. The sum of that list was: " + totalSum);

        scanner.close();
    }

    public static int getSum(List<Integer> myList) {
        int total = 0;
        for (int num : myList) {
            total += num;
        }
        return total;
    }
}
