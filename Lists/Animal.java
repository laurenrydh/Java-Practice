package Lists;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Animal {
    private String name;
    private boolean dog;

    public String getName() {
        return this.name;
    }

    public boolean isDog() {
        return this.dog;
    }

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.dog = isDog;
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");
        while (true) {
            System.out.print("Please enter a name: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("Is is a dog? Yes or no: ");
            String answer = scanner.nextLine().toLowerCase();
            boolean isDog = false;
            if (answer.equals("yes")) {
                isDog = true;
            }
            animals.add(new Animal(name, isDog));
        }
        for (int i = 0; i < animals.size(); i++) {
            Animal maybeDog = animals.get(i);
            System.out.println(maybeDog.getName() + " is a dog = " + maybeDog.isDog());
        }
    }
}
