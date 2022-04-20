import java.util.Scanner;

public class calculator {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter option:");
        int option = scn.nextInt();

        if (option > 4) {
            System.out.println("Invalid option");
            return;
        }

        System.out.print("Enter number 1:");
        int a = scn.nextInt();

        System.out.print("Enter number 2:");
        int b = scn.nextInt();

        calc(option, a, b);
    }

    public static void calc(int option, int a, int b) {
        if (option == 0) {
            int ans = sum(a, b);
            System.out.println(a + " + " + b + " = " + ans);
        } else if (option == 1) {
            int ans = subtract(a, b);
            System.out.println(a + " - " + b + " = " + ans);
        } else if (option == 2) {
            int ans = multiply(a, b);
            System.out.println(a + " * " + b + " = " + ans);
        } else if (option == 3) {
            double ans = divide(a, b);
            System.out.println(a + " / " + b + " = " + ans);
        } else {
            int ans = remainder(a, b);
            System.out.println(a + " % " + b + " = " + ans);
        }
    }

    // sum
    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    // subtract
    public static int subtract(int a, int b) {
        int c = a - b;
        return c;
    }

    // multiply
    public static int multiply(int a, int b) {
        int c = a * b;
        return c;
    }

    // divide
    public static double divide(int a, int b) {
        // double c = (double)a / b;
        double c = (a * 1.0) / b;
        return c;
    }

    // remainder
    public static int remainder(int a, int b) {
        int c = a % b;
        return c;
    }

}
