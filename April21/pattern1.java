import java.util.Scanner;

public class pattern1 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        pattern_();
        System.out.println("kamal");
        pattern_();
        System.out.println("Aggarwal");
        pattern_();
    }

    public static void pattern_() {
        for (int i = 1; i <= 5; i++) {
            singleLine();
            System.out.println();
        }
    }

    public static void singleLine() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }
    }
}
