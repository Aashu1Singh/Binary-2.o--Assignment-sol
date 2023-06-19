class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = 1;
        int len = nums.length;
        if (len == 0) {
            return;
        }

        // finding the zero with index i and then swapping it with elements with index j
        // (given that jth index element is not zero)

        // if jth index element is zero then we check again by decrementing val of j

        while (i < len - 1 && j < len) {
            if (nums[i] == 0) {
                if (nums[j] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j++;
                } else if (j < len) {
                    j++;
                }
            } else {
                i++;
                j++;

            }

        }

    }
}

public class Ques_7 {
    public static void main(String[] args) {

        // 💡 **Q7.** Given an integer array nums, move all 0's to the end of it while
        // maintaining the relative order of the nonzero elements.

        // Note that you must do this in-place without making a copy of the array.

        // **Example 1:**
        // Input: nums = [0,1,0,3,12]
        // Output: [1,3,12,0,0]

        // Ans: --===>>> Solution class

    }
}
