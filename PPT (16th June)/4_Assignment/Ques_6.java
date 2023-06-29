class Solution {
    public int[] sortedSquares(int[] nums) {

        int i = nums.length - 1;
        int j = 0;
        int k = 0;

        int[] ans = new int[nums.length];

        // positioning index i at first negative no and j at first positive no

        while (i >= 0 && nums[i] >= 0) {
            i--;
        }
        while (j <= nums.length - 1 && nums[j] < 0) {
            j++;
        }

        while (i >= 0 && j <= nums.length - 1) {
            int val1 = nums[i] * nums[i];
            int val2 = nums[j] * nums[j];

            if (val1 < val2) {
                ans[k++] = val1;
                i--;
            } else if (val1 >= val2) {
                ans[k++] = val2;
                j++;
            }
        }

        while (i >= 0) {
            ans[k++] = nums[i] * nums[i];
            i--;
        }

        while (j <= nums.length - 1) {
            ans[k++] = nums[j] * nums[j];
            j++;
        }

        return ans;
    }
}

public class Ques_6 {

}
