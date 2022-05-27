import java.util.Arrays;

public class SortString1 {
    public static void main(String[] args) {
        String str = "hello";
        // O(n)+O(n)
        String ans = sort(str);
        System.out.println(ans);
    }

    public static String sort(String str) {
        // CONVERT INTO CHAR ARRAY
        char[] arr = stringToCharArray(str);// O(n)+O(n)

        // SORT ARRAY
        sortCharArray(arr);// O(n)+O(1)

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

    public static void sortCharArray(char[] arr) {
        // CREATE FREQUENCY MAP
        int[] fmap = createFrequencyMap(arr);

        // SORT USING FREQUENCY ARRAY
        sortArrayUsingFrequencymap(arr, fmap);
    }

    public static int[] createFrequencyMap(char[] arr) {
        int[] fmap = new int[256];
        for (int i = 0; i < arr.length; i++) {
            // char ch = arr[i];
            int ascii = arr[i];
            fmap[ascii]++;
        }
        return fmap;
    }

    public static void sortArrayUsingFrequencymap(char[] arr, int[] fmap) {
        int k = 0;
        for (int i = 0; i < fmap.length; i++) {
            int val = i;
            int freq = fmap[i];
            for (int j = 0; j < freq; j++) {
                arr[k] = (char) val;// integer to char
                k++;
            }
        }
    }

}