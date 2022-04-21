
import java.util.Scanner;

public class pattern5 {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfLines = scn.nextInt();
        pattern(numberOfLines);
    }

    public static void pattern(int numberOfLines) {
        for (int i = 1; i <= numberOfLines; i++) {
            int stars = i;
            int spaces = numberOfLines - i;
            printSpace(spaces);
            printStar(stars);
            System.out.println();
        }
    }

    // star print
    public static void printStar(int numberOfStars) {
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.print("*");
        }
    }

    // space print
    public static void printSpace(int numberOfSpaces) {
        for (int i = 1; i <= numberOfSpaces; i++) {
            System.out.print(" ");
        }
    }

}
