
import java.util.Scanner;

public class MostFrequent {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String str = scn.nextLine();
        int[] ans = allIndices(str);
        printArray(ans);
    }

    public static int[] allIndices(String str) {
        // create map
        int[] map = new int[26];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            map[ch - 'a']++;
        }
        // get character with max frequency
        char ch = ' ';
        int maxfreq = 0;
        for (int i = 0; i < 26; i++) {
            int currfreq = map[i];
            if (currfreq > maxfreq) {
                maxfreq = currfreq;
                ch = (char) ('a' + i);
            }
        }
        // E: aabcddss
        // ch->a and maxfreq=2
        int[] ans = new int[maxfreq];
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                ans[k] = i;
                k++;
            }
        }
        return ans;
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
