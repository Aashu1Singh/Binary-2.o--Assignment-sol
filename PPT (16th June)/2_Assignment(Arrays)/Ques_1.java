import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int i = 0;
        int j = 1;

        int sum = 0;

        while (i < n) {
            sum += Math.min(nums[i], nums[j]);
            i += 2;
            j += 2;
        }

        return sum;

    }
}

public class Ques_1 {

    public static void main(String[] args) {

        // Question 1
        // Given an integer array nums of 2n integers, group these integers into n pairs
        // (a1, b1), (a2, b2),..., (an, bn) such that the sum of min(ai, bi) for all i
        // is maximized. Return the maximized sum.

        // Example 1:
        // Input: nums = [1,4,3,2]
        // Output: 4

        // Anss=====>>>>>>>> solution 

    }

}
