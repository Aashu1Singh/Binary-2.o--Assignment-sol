import java.util.Arrays;

class Solution {
    public boolean containsDuplicateElement(int[] nums) {


        // short the array 
        Arrays.sort(nums);


        // check the next element for duplicate if it contain duplicate then return true 
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        // if no duplicate found return false 
        return false;

    }
}

public class Ques_6 {
    public static void main(String[] args) {

        // 💡 **Q6.** Given an integer array nums, return true if any value appears at
        // least twice in the array, and return false if every element is distinct.

        // **Example 1:**
        // Input: nums = [1,2,3,1]

        // Output: true

        // Solution : =>>> Solution class

    }
}