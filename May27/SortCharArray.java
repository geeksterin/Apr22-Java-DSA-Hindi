import java.util.Arrays;

public class SortCharArray {
    public static void main(String[] args) {
        char[] arr = { 's', 'd', 'f', 'a', 'a', 'e' };
        sort(arr);
        printArray(arr);
    }

    public static void sort(char[] arr) {
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

    public static void printArray(char[] arr) {
        for (char ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}