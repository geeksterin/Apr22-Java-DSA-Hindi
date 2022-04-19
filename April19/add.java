import java.util.Scanner;

public class add {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // sum();
        // int c = sum(3, 5);
        // System.out.println(c);
    }

    public static int sum() {
        System.out.print("Enter number a:");
        int a = scn.nextInt();
        System.out.print("Enter number b:");
        int b = scn.nextInt();

        int c = a + b;

        System.out.println(c);

        return 0;
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

}
