public class RotateOpti {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotateArrayByK(arr, 4);
        printArray(arr);
    }

    public static void rotateArrayByK(int[] arr, int k) {
        int len = arr.length;
        // K>= LEN
        k = (k % len);
        // K<0
        if (k < 0)
            k = (len - k);

        reverse(arr, 0, len - k - 1);// first half//O(n)
        reverse(arr, len - k, len - 1);// second half//O(n)
        reverse(arr, 0, len - 1);// complete//O(n)
    }

    public static void reverse(int[] arr, int st, int end) {
        while (st < end) {
            arr[end] = ((arr[st] + arr[end]) - (arr[st] = arr[end]));
            st++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}