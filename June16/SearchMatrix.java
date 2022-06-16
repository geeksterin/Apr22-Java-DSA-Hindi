public class SearchMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[0][0];
        int[] ans = search(arr,10);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] search(int[][] mat, int target) {
        int r = mat.length;
        int c = mat[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == target) {
                    // int[] ans = new int[2];
                    // ans[0] = i;
                    // ans[1] = j;
                    // return ans;
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }
}