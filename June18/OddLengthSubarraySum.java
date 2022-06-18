public class OddLengthSubarraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 3 };
        int ans = sumcalculate(arr);
        System.out.println(ans);
    }

    public static int sumcalculate(int[] arr) {
        int len = arr.length;
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            sum = 0;
            for (int j = i; j < len; j++) {
                sum += arr[j];
                if ((j - i + 1) % 2 != 0) {
                    ans += sum;
                }
            }
        }
        return ans;
    }

    public static int sumcalculate_(int[] arr) {
        int ans = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int total = ((i + 1) * (len - i));
            int odd = (total + 1) / 2;
            ans += (odd * arr[i]);
        }
        return ans;
    }
}