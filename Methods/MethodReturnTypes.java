package Methods;

public class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println(giveString());
        System.out.println(giveInteger());
        System.out.println(giveBoolean());
    }

    public static String giveString() {
        return "This is a string";
    }

    public static Integer giveInteger() {
        return 24;
    }

    public static Boolean giveBoolean() {
        return true;
    }
}
