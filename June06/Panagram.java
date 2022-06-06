import java.util.Scanner;

public class Panagram {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String str = scn.nextLine();
        boolean ans = isPanagram(str);
        if (ans == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPanagram(String str) {
        int[] fmap = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ch = convertToSmallCase(ch);
            if (ch == '0') {// character is not a letter
                continue;
            }
            fmap[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (fmap[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static char convertToSmallCase(char ch) {
        // 'p'->'p'
        //'P'->'p'
        //'*'->'0'
        if (ch >= 'a' && ch <= 'z') {
            return ch;
        }
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        }
        return '0';
    }
}