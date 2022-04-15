import java.util.Scanner;

public class sum {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = a + b;
        System.out.println("sum of " + a + " and " + b + " is " + c);
    }
}