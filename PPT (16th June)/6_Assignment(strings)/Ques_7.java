class Solution {
    public int[][] generateMatrix(int n) {

        int ans[][] = new int[n][n];

        int row = n;
        int col = n;
        int k = 1;
        int curRow = 0;
        int curCol = 0;
        while (k <= n * n) {

            for (int i = curCol; i < col; i++) {
                ans[curCol][i] = k;
                k++;
            }
            curRow++;

            for (int i = curRow; i < row; i++) {
                ans[i][col - 1] = k;
                k++;
            }
            col--;

            for (int i = col - 1; i >= curCol; i--) {
                ans[row - 1][i] = k;
                k++;
            }
            row--;

            for (int i = row - 1; i > curCol; i--) {
                ans[i][curCol] = k;
                k++;
            }
            curCol++;

        }
        return ans;

    }
}

public class Ques_7 {

    public static void main(String[] args) {

    }
}
