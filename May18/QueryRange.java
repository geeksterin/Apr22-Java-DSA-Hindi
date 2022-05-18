public class QueryRange {
    public static void main(String[] args) {
        int[] arr = {};
        int[][] query = {};
        int[] ans = rangeSumForAllQueries(arr, query);
        printArray(ans);
    }

    public static int[] rangeSumForAllQueries(int[] arr, int[][] query) {
        int[] ps = prefixArray(arr);
        int[] ans = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            int st = query[i][0];
            int end = query[i][1];
            // if (st == 0) {
            // int sum = ps[end];
            // } else {
            // int sum = ps[end] - ps[st-1];
            // }
            int sum = (ps[end]) - (st == 0 ? 0 : ps[st - 1]);
            ans[i] = sum;
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
