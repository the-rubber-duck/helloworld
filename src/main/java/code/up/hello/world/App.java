package code.up.hello.world;

/**
 * Hello world!
 *
 */
public class App {

    private static String Panda = "Cutie";

    private static int One = 1;
    private static int Two = 2;

    public static void main(String[] args) {
        int sum = add(One, Two);
        System.out.println("Hello World!");
        System.out.println("Sum is " + sum);
        int newNumber = App.add(sum, sum);
        System.out.println("Sum is " + newNumber);
        int LawNumber = sub(One, Two);
        System.out.println("1 - 2 = " + LawNumber);
        int LawNewNumber = App.sub(newNumber, sum);
        System.out.println("6 - 3 = " + LawNewNumber);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }
}
