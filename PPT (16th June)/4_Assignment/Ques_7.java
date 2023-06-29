class Solution {
    public int maxCount(int m, int n, int[][] ops) {

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        if (ops.length == 0) {
            return m * n;
        }

        for (int i = 0; i < ops.length; i++) {
            int valX = ops[i][0];
            int valY = ops[i][1];

            if (valX < minX) {
                minX = valX;
            }

            if (valY < minY) {
                minY = valY;
            }

        }

        return minX * minY;

    }
}

public class Ques_7 {

    public static void main(String[] args) {

    }

}
