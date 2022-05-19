public class SquareSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        squareSort(arr);
        printArray(arr);
    }

    public static void squareSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] * arr[i]);
        }
        Arrays.sort(arr);
    }

    public static int[] squareSortOpti(int[] arr) {
        int len = arr.length;
        int[] ans = new int[len];
        int st = 0;
        int end = len - 1;
        int k = len - 1;
        while (st <= end) {
            int s1 = arr[st] * arr[st];
            int s2 = arr[end] * arr[end];
            if (s1 > s2) {
                ans[k] = s1;
                st++;
            } else {
                ans[k] = s2;
                end--;
            }
            k--;
        }
        return ans;
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}