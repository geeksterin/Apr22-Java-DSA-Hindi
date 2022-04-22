import java.util.Scanner;

public class pattern1 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // singleLine();
        // System.out.println();
        // singleLine();
        // System.out.println();
        // singleLine();
        int numberOfLines = scn.nextInt();
        // starPattern(numberOfLines);
        // numberpattern(numberOfLines);
        // starPattern(numberOfLines);
        // numberpattern(numberOfLines);
        // starPattern(numberOfLines);
        // numberpattern(numberOfLines);
        alphabetpattern(numberOfLines);

    }

    public static void starPattern(int numberOfLines) {
        for (int i = 1; i <= numberOfLines; i++) {
            printStar();
            System.out.println();
        }
    }

    public static void printStar() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
    }

    public static void numberpattern(int numberOfLines) {
        for (int i = 1; i <= numberOfLines; i++) {
            printNumber();
            System.out.println();
        }
    }

    public static void printNumber() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }

    public static void alphabetpattern(int numberOfLines) {
        for (int i = 1; i <= numberOfLines; i++) {
            printalphabet();
            System.out.println();
        }
    }

    public static void printalphabet() {
        for (int i = 0; i <= 4; i++) {
            System.out.print((char) ('a' + i) + " ");
        }
    }
}
