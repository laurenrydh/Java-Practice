package Methods;

public class DivideMethod {
    public static void main(String[] args) {
        divide(1, 3);
    }

    public static void divide(int num1, int num2) {
        double answer = (double) num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + answer);
    }
}
