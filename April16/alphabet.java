import java.util.Scanner;

public class alphabet {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // METHOD 1
        // System.out.println((char) (99));
        // for (int i = 97; i <= 122; i++) {
        // System.out.print((char) (i) + " ");
        // }

        // METHOD 2
        // int a = 'a';
        // System.out.println(a);
        for (int i = 0; i < 26; i++) {
            System.out.print((char) ('A' + i) + " ");
        }
    }
}
