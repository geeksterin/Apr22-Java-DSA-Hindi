public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, }, { 4, 5, 6 }, { 8, 9, 10 } };
        int target = 11;
        int[] ans = search(matrix, target);
        System.out.print("(" + ans[0] + ", " + ans[1] + ")");
    }

    public static int[] search(int[][] matrix, int target) {
        int ansrow = -1;
        int anscol = -1;
        a: for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    // int[] ans = new int[2];
                    // ans[0] = i;
                    // ans[1] = j;
                    // return ans;
                    // return new int[] { i, j };
                    ansrow = i;
                    anscol = j;
                    break a;
                }
            }
        }
        // int[] ans = new int[2];
        // ans[0] = -1;
        // ans[1] = -1;
        // return ans;
        // return new int[] { -1, -1 };
        return new int[] { ansrow, anscol };
    }
}
