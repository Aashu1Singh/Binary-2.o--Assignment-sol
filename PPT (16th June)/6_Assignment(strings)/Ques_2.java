class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int j = matrix[0].length - 1;
        int i = 0;
        while (j >= 0 && i < matrix.length) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}

public class Ques_2 {

}