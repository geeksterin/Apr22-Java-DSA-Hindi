import java.util.Scanner;

public class sum {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number a:");
        int a = scn.nextInt();
        System.out.print("Enter number b:");
        int b = scn.nextInt();
        int c = a + b;
        System.out.println("sum of " + a + " and " + b + " is " + c);
    }
}