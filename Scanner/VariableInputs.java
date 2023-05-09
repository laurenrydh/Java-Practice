package Scanner;
import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String yourString = scanner.nextLine();

        System.out.println("Enter an integer: ");
        Integer yourInteger = scanner.nextInt();

        System.out.println("Enter a double: ");
        Double yourDouble = scanner.nextDouble();

        System.out.println("Enter a boolean value: ");
        Boolean yourBoolean = scanner.nextBoolean();

        System.out.println("Your string is " + yourString);
        System.out.println("Your integer is " + yourInteger);
        System.out.println("Your double is " + yourDouble);
        System.out.println("Your boolean is " + yourBoolean);
        scanner.close();
    }
}
 