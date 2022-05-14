public class FirstMissing {
    public static void main(String[] args) {
        int[] arr = {};
        int ans = missing(arr);
    }

    public static int missing(int[] arr) {
        int n = arr.length;
        for (int i = 1; i <= n; i++) {
            boolean res = search(arr, i);
            if (res == false) {
                return i;
            }
        }
        return n + 1;
    }

    public static boolean search(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return true;
            }
        }
        return false;
    }

}
