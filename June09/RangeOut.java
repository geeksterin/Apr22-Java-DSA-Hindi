public class RangeOut {
    public static void main(String[] args) {
        // -128->127
        // byte a = (byte) (127 + 1);// 128
        // byte a = (byte) (-128 - 1);
        // System.out.println(a);
        // "geekster"
        // 'c'
        // 500

        // int val=1000000007*2;
        // System.out.println(val);

        // int[] arr = { 2147483647, 5, 3, 4, 5 };
        // int sum = sum(arr);
        // System.out.println(sum);
        String str = "geekster";
        main("Geekster");
    }

    public static int sum(int[] arr) {
        int ans = 0;
        int mod = 1000000007;
        for (int i = 0; i < arr.length; i++) {
            // ans = (ans + arr[i]);
            ans = ((ans % mod) + (arr[i] % mod)) % mod;
        }
        return ans;
    }

    public static void main(String str) {
        System.out.println(str);
    }
}