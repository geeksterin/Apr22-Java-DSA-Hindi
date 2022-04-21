
import java.util.Scanner;

public class pattern3 {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfLines = scn.nextInt();
        pattern_(numberOfLines);
    }

    public static void pattern_(int numberOfLines) {
        for (int i = numberOfLines; i >= 1; i--) {
            singleLine(i);
            System.out.println();
        }
    }

    public static void singleLine(int numberofstarts) {
        for (int i = 1; i <= numberofstarts; i++) {
            System.out.print(i+" ");
        }
    }
}
