import java.util.Arrays;
public class SortMatrixAsOneD {
    public static void main(String[] args) {
        int[][] arr = { { -3, -2, 4 }, { 98, 35, -9 }, { 87, 56, 34 }, { -4, 9, 56 } };
        int[][] ans = sort(arr);
        printArray(ans);
    }

    public static int[][] sort(int[][] mat) {
        // convert to 1D
        int[] arr = twoDToOneD(mat);
        // sort
        Arrays.sort(arr);
        // 1D to 2D
        int[][] ans = oneDToTwoD(arr, mat.length, mat[0].length);
        return ans;
    }

    // 2D to 1D Array

    public static int[] twoDToOneD(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int[] arr = new int[r * c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int idx = i * c + j;
                arr[idx] = mat[i][j];
            }
        }
        return arr;
    }

    // 1D to 2D
    public static int[][] oneDToTwoD(int[] arr, int r, int c) {
        int[][] mat = new int[r][c];
        for (int idx = 0; idx < arr.length; idx++) {
            int i = (idx / c);
            int j = (idx % c);
            mat[i][j] = arr[idx];
        }
        return mat;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}