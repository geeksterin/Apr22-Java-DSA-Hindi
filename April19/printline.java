import java.util.Scanner;

public class printline {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();// n==12
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            if ((i % 4) == 0) {
                // System.out.println();
                System.out.print("\n");
            }
        }
    }

}
