import java.util.Scanner;

public class nestedloops {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // int n = scn.nextInt();// n==12
        // for (int i = 1; i <= 4; i++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // for (int i = 1; i <= 4; i++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // for (int i = 1; i <= 4; i++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // for (int i = 1; i <= 4; i++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // for (int i = 1; i <= 4; i++) {
        // System.out.print(i + " ");
        // }

        // for (int j = 1; j <= 5; j++) {
        // for (int i = 1; i <= 4; i++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // int k = 1;
        // for (int j = 1; j <= 4; j++) {
        // for (int i = 1; i <= 4; i++) {
        // System.out.print(k + " ");
        // k++;
        // }
        // System.out.println();
        // }

        // for (int j = 1; j <= 4; j++) {
        // for (int i = 1; i <= 4; i++) {
        // System.out.print((i + (j - 1) * 4) + " ");
        // }
        // System.out.println();
        // }

        for (int j = 0; j <= 3; j++) {
            for (int i = 1; i <= 4; i++) {
                System.out.print((i + (j) * 4) + " ");
            }
            System.out.println();
        }
    }

}
