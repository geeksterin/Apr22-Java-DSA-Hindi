import java.util.Arrays;

public class SortString2 {
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
        char[] arr = str.toCharArray();
        return arr;
    }

    public static String charArrayToString(char[] arr) {
        String ans = String.valueOf(arr);
        return ans;
    }
}