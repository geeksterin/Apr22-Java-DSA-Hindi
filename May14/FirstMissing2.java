public class FirstMissing2 {
    public static void main(String[] args) {
        int[] arr = {};
        int ans = missing(arr);
    }

    public static int missing(int[] arr) {
        Arrays.sort(arr);
        int i = 1;
        int j = 0;
        while (j < arr.length) {
            if (arr[j] == i) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i;
    }

}
