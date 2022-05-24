import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {
        String str = "geekster";
        // String ans = reverse01(str);
        // System.out.println(ans);
        // String ans = reverse02(str);
        // System.out.println(ans);
        String ans = reverse03(str);
        System.out.println(ans);
    }

    public static String reverse01(String str) {
        String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {// O(n)
            char ch = str.charAt(i);
            ans = ans + ch;// O(n)
        }
        return ans;
    }

    public static String reverse02(String str) {
        String ans = "";
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {// O(n)
            char ch = str.charAt(i);// O(1)
            sb.append(ch);// O(1)
        }
        ans = sb.toString();// O(n)
        return ans;
    }

    public static String reverse03(String str) {
        String ans = "";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();// O(n)
        ans = sb.toString();// O(n)
        return ans;
    }

}
