import java.util.Scanner;

public class evenodd {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        // even numbers
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }

        // for (int i = 1; i <= 50; i++) {
        // if (i % 2 == 0) {// remainder with 2 is 0
        // System.out.println(i);
        // }
        // }

        System.out.println();
        // odd numbers
        for (int i = 1; i <= 50; i += 2) {
            System.out.println(i);
        }

    }
}
