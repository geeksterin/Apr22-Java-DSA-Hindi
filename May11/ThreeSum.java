public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 4, 4, 4 };
        int target = 6;
        threeSum(arr, target);
    }

    public static void threeSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            twoSum(arr, target - arr[i], i + 1, arr.length - 1);
        }
    }

    public static void twoSum(int[] arr, int target, int st, int end) {
        int fval = arr[st - 1];
        while (st < end) {

            if (end != arr.length - 1 && arr[end] == arr[end + 1]) {
                end--;
                continue;
            }
            int sum = arr[st] + arr[end];
            if (sum == target) {
                System.out.println("(" + fval + "," + arr[st] + "," + arr[end] + ")");
                // printing
                st++;
                end--;
            } else if (sum < target) {
                st++;
            } else {
                end--;
            }
        }
    }
}
