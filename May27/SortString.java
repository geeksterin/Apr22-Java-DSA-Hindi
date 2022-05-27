public class SortString {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 4, 4, 4, 3, 0, 9, 0, 7, 6, 5, 6, 4, 4, 3, 3, 1, 1, 2, 0 };
        sort(arr);// O(n)+O(1)
        printArray(arr);
    }

    public static void sort(int[] arr) {
        // CREATE FREQMAP
        int[] fmap = createFrequencyMap(arr);// O(n)+O(10)

        // SORT ARRAY USING FREQUENCY MAP
        sortArrayUsingFrequencymap(arr, fmap);// O(n)+(1)
    }

    public static int[] createFrequencyMap(int[] arr) {
        int[] fmap = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            fmap[val]++;
        }
        return fmap;
    }

    public static void sortArrayUsingFrequencymap(int[] arr, int[] fmap) {
        int k = 0;
        for (int i = 0; i < fmap.length; i++) {
            int val = i;
            int freq = fmap[i];
            for (int j = 0; j < freq; j++) {
                arr[k] = val;
                k++;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}