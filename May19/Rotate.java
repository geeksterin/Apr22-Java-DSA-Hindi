public class Rotate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // rotateArrayByOne(arr);
        rotateArrayByK(arr, 1);
        printArray(arr);
    }

    public static void rotateArrayByOne(int[] arr) {
        int len = arr.length;
        int temp = arr[len - 1];
        for (int i = len - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void rotateArrayByK(int[] arr, int k) {

        for (int i = 1; i <= k; i++) {// O(k)
            rotateArrayByOne(arr);// O(n)
        }
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}