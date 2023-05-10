package ArraysLists;

import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers, type 0 to quit:");
        int newInt = scanner.nextInt();

        while (newInt != 0) {
            integers.add(newInt);
            newInt = scanner.nextInt();
        }
        System.out.println("Done entering integers into the list");
        System.out.println("What number are you looking for in the list?");
        int searchedNum = scanner.nextInt();
        
        boolean found = false;
        for(int i = 0; i < integers.size(); i++){
            if(integers.get(i) == searchedNum) {
                found = true;
                System.out.println(searchedNum + " is at position " + i);
            }
        }

        if (!found) {
            System.out.println(searchedNum + " is not in this list.");
        }
        scanner.close();
    }
}
