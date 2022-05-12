import java.util.Scanner;

public class pattern4 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfLines = scn.nextInt();
        starPattern(numberOfLines);
    }

    public static void starPattern(int numberOfLines) {
        for (int i = 1; i <= numberOfLines; i++) {
            printSpace(numberOfLines - i);
            printStar(i);
            System.out.println();
        }
    }

    public static void printStar(int star) {
        for (int i = 1; i <= star; i++) {
            System.out.print("*");
        }
    }

    public static void printSpace(int space) {
        for (int i = 1; i <= space; i++) {
            System.out.print(" ");
        }
    }

}
