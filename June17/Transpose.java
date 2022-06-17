public class Transpose {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int[][] ans = transpose(arr);
        printArray(ans);
    }

    public static int[][] transpose(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] ans = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
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