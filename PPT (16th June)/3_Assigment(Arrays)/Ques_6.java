class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;
        for (int i : nums) {
            // taking XOR because (a ^ b ^ a) = b (irrespective of positions)
            ans = ans ^ i;
        }

        return ans;

    }
}

public class Ques_6 {

    public static void main(String[] args) {
        // Q 6 )

        // Given a non-empty array of integers nums, every element appears twice except
        // for one. Find that single one.

        // You must implement a solution with a linear runtime complexity and use only
        // constant extra space.

        // Example 1:
        // Input: nums = [2,2,1]
        // Output: 1

        // Answer ==>>>>>> Solution

    }

}


