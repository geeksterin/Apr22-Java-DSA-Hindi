public class Subarrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        printSubarrays(arr);
    }

    public static void printSubarrays(int[] arr) {
        int len = arr.length;
        for (int st = 0; st < len; st++) {
            for (int end = st; end < len; end++) {
                printArray(arr, st, end);
            }
        }
    }

    public static void printArray(int[] arr, int st, int end) {
        for (int i = st; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
