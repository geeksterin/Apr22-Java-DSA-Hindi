import java.util.Scanner;

public class functions {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int c = sum(10, 15);// main().c
        System.out.println(c);
    }

    public static int sum(int a, int b) {
        int c = a + b;// sum().c
        return c;
        // return (a + b);
    }

    // NAME CHANGE

    public static int add(int a, int b) {
        return (a + b);
    }

    // Parameter count change
    public static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    // Parameter Data type change
    public static double sum(double a, int b) {
        return (a + b);
    }

}
