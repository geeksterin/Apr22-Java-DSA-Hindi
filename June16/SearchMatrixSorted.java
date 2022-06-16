public class SearchMatrixSorted {
    public static void main(String[] args) {
        int[][] arr = new int[0][0];
        boolean ans = search(arr, 10);
        System.out.println(ans);
    }

    public static boolean search(int[][] mat, int target) {
        int r = mat.length;
        int c = mat[0].length;
        int i = 0;
        int j = c - 1;
        while (j >= 0 && i < r) {
            int val = mat[i][j];
            if (val < target) {
                i++;
            } else if (val > target) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}