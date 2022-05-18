public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = { -1, 13, 2, 4, -5, 8 };
        int ans = rangeSum(arr, 1, 4);
        System.out.println(ans);
        // printArray(ps);
    }

    public static int rangeSum(int[] arr, int st, int end) {
        int[] ps = prefixArray(arr);
        for (int i = 0; i < arr.length; i++) {
            int ans = ps[end] - ps[st - 1];
        }
        return ans;
    }

    public static int[] prefixArray(int[] arr) {
        int len = arr.length;
        int[] ps = new int[len];
        ps[0] = arr[0];
        for (int i = 1; i < len; i++) {
            ps[i] = ps[i - 1] + arr[i];
        }
        return ps;
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}