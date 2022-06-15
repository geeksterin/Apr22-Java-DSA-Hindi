public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = { 10, -2, -2, 2, 6, 2, -2, 2, 6 };
        int ans = countSubarrays(arr, 8);
        System.out.println(ans);
    }

    public static int countSubarrays(int[] arr, int target) {
        int ans = 0;
        int sum = 0;
        // int max = Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {
            sum = 0;
            // max = Integer.MIN_VALUE;
            for (int end = start; end < arr.length; end++) {
                sum = sum + arr[end];
                if (sum == target) {
                    System.out.println("( " + start + ", " + end + " )");
                    ans++;
                }
                // if (sum > max) {
                //     max = sum;
                // }
            }
        }
        return ans;
    }

}