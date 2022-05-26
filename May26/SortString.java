import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "hello";
        // O(nlogn)+O(n)
        String ans = sort(str);
        System.out.println(ans);
    }

    public static String sort(String str) {
        // CONVERT INTO CHAR ARRAY
        char[] arr = stringToCharArray(str);// O(n)+O(n)

        // SORT ARRAY
        Arrays.sort(arr);// O(nlogn)

        // CONVERT CHAR ARRAY TO STRING
        String ans = charArrayToString(arr);// O(n)+O(n)

        return ans;
    }

    public static char[] stringToCharArray(String str) {
        int len = str.length();
        char[] arr = new char[len];
        for (int i = 0; i < len; i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static String charArrayToString(char[] arr) {
        int len = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(arr[i]);
        }
        String ans = String.valueOf(sb);
        // String ans=sb.toString();
        return ans;
    }
}