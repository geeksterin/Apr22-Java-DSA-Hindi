import java.util.Scanner;

public class pattern2 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfLines = scn.nextInt();
        starPattern(numberOfLines);
        reverseStarPattern(numberOfLines);
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
