class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;

        for (int i = 0; i < arr1.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr2.length; j++) {
                int val = Math.abs(arr1[i] - arr2[j]);
                if (val <= d) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans++;
            }
        }

        return ans;
    }
}

public class Ques_5 {

    public static void main(String[] args) {
        // Given two integer arrays arr1 and arr2, and the integer d, *return the
        // distance value between the two arrays*.

        // The distance value is defined as the number of elements arr1[i] such that
        // there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.

        // **Example 1:**

        // **Input:** arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2

        // **Output:** 2
    }

}
