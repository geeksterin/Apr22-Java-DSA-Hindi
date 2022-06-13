import java.util.Scanner;

public class Functions {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = add(a, b);
        System.out.println(c);
    }

    // FUNCTION DEFINITION
    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int add(double a, int b) {
        int c = (int) a + b;
        return c;
    }
}