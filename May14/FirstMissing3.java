public class FirstMissing3 {
    public static void main(String[] args) {
        int[] arr = {};
        int ans = missing(arr);
    }

    public static int missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int cidx = arr[i] - 1;
            // skip
            if (arr[i] < 1 || arr[i] > arr.length || arr[i] == i + 1 ||
                    arr[cidx] == cidx + 1) {
                i++;
            } else {
                swap(arr, i, cidx);
            }
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return arr.length + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        arr[j] = ((arr[i] + arr[j]) - (arr[i] = arr[j]));
    }

}
