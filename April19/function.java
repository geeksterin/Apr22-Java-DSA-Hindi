import java.util.Scanner;

public class function {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.print("Enter first number :");
        // int a = scn.nextInt();
        // System.out.print("Enter second number :");
        // int b = scn.nextInt();

        // int c = a + b;
        // System.out.println("Sum of " + a + " and " + b + " is " + c);

        int c = sum(5, 10);// function calling

        System.out.println("Sum is " + c);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    // name change
    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    // parameter count change
    public static int sum(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }

    // parameter type change
    public static int sum(double a, int b, int c) {
        int d = a + b + c;
        return d;
    }

}
