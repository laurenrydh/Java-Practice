package Methods;

public class AverageMethod {
    public static void main(String[] args) {
        System.out.println("The average is: " + sum(2, 5, 8));
    }

    public static Double sum(int num1, int num2, int num3) {
        double answer = (num1 + num2 + num3) / (double) 3;
        return answer;
    }
}
