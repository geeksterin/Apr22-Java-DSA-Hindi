import java.util.Scanner;

public class pattern3 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfLines = scn.nextInt();
        int numberOfLines1 = (numberOfLines / 2);
        int numberOfLines2 = ((numberOfLines / 2) + 1);
        starPattern(numberOfLines1);
        reverseStarPattern(numberOfLines2);
    }

    public static void starPattern(int numberOfLines) {
        for (int i = 1; i <= numberOfLines; i++) {
            printStar(i);
            System.out.println();
        }
    }

    public static void printStar(int star) {
        for (int i = 1; i <= star; i++) {
            System.out.print("* ");
        }
    }

    public static void reverseStarPattern(int numberOfLines) {
        for (int i = numberOfLines; i >= 1; i--) {
            printStar(i);
            System.out.println();
        }
    }

}
