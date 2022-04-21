
import java.util.Scanner;

public class pattern4 {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfLines = scn.nextInt();
        pattern(numberOfLines);
    }

    public static void pattern(int numberOfLines) {
        for (int i = numberOfLines; i >= 1; i--) {
            if (i % 2 != 0) {// even
                printStars(i);
            } else {// odd
                printNumbers(i);
            }
            System.out.println();
        }
    }

    // print numbers
    public static void printNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
    }

    // print stars

    public static void printStars(int numberOfStars) {
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.print("* ");
        }
    }

}
