
public class ToggleCase {
    public static void main(String[] args) {
        String str = "mjgsdcjxhvVHGAFJACVJDghcukydtcGD";
        String ans = toggle(str);
        System.out.println(ans);
    }

    public static String toggle(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isUpper(ch)) {
                ch = (char) (ch + 32);
            } else {
                ch = (char) (ch - 32);
            }
            ans = ans + ch;
        }
        return ans;
    }

    public static boolean isUpper(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return true;
        }
        return false;
    }

    public static boolean isLower(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return true;
        }
        return false;
    }

}
