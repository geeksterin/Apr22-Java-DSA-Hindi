
import java.util.Scanner;

public class IsSubseq {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        boolean ans = isSubseq(str1, str2);
        if (ans == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isSubseq(String str1, String str2) {
        int p1 = 0;
        int p2 = 0;
        while (p1 < str1.length() && p2 < str2.length()) {
            char ch1 = str1.charAt(p1);
            char ch2 = str2.charAt(p2);
            if (ch1 == ch2) {
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        if (p1 == str1.length()) {
            return true;
        } else {
            return false;
        }
    }
}
