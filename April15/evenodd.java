import java.util.Scanner;

public class evenodd {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scn.nextInt();
        int rem = (a % 2);
        if (rem == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}