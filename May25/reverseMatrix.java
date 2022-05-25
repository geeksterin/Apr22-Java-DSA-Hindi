public class reverseMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        swapRow(arr);
        swapCol(arr);
        printMatrix(arr);
    }

    public static void swapCol(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int st = 0;
            int end = mat[0].length - 1;
            while (st < end) {
                swap(mat, i, st, i, end);
                st++;
                end--;
            }
        }
    }

    public static void swapRow(int[][] mat) {
        for (int i = 0; i < mat[0].length; i++) {
            int st = 0;
            int end = mat.length - 1;
            while (st < end) {
                swap(mat, st, i, end, i);
                st++;
                end--;
            }
        }
    }

    public static void swap(int[][] arr, int i, int j, int k, int l) {
        arr[k][l] = ((arr[i][j] + arr[k][l]) - (arr[i][j] = arr[k][l]));
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}