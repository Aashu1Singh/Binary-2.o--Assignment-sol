class Solution {
    public int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (ans > nums[i]) {
                ans = nums[i];
            } else if (ans < nums[i]) {
                break;
            }
        }
        return ans;

    }
}

public class Ques_7 {

    public static void main(String[] args) {

    }
}
