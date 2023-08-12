class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int check = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int val = Math.abs((nums[i] + nums[j] + nums[k]) - target);
                    if (val < check) {
                        ans = (nums[i] + nums[j] + nums[k]);
                        check = val;
                    }
                }
            }
        }
        return ans;

    }
}

public class Ques_1 {

    
    public static void main(String[] args) {

        // Q 1)
        // Question 1
        // Given an integer array nums of length n and an integer target, find three
        // integers
        // in nums such that the sum is closest to the target.
        // Return the sum of the three integers.

        // You may assume that each input would have exactly one solution.

        // Example 1:
        // Input: nums = [-1,2,1,-4], target = 1
        // Output: 2

    }

}
