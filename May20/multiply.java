public class multiply {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 1 }, { 3, 6, 4, 2 }, { 8, 1, -1, 4 } };// 3*4
        int[][] b = { { 2, 1 }, { 1, 3 }, { 4, 6 } };// 3*2
        int[][] ans = multiplyMatrix(a, b);
        printMatrix(ans);
    }

    public static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int m = a.length;
        int n = a[0].length;
        int p = b.length;
        int q = b[0].length;
        if (n != p) {
            System.out.println("Invaild dimensions");
            return new int[0][0];// empty
            // return null;
        }

        int[][] ans = new int[m][q];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    ans[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        return ans;
    }

    public static void printMatrix(int[][] matrix) {
        // null.length
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}