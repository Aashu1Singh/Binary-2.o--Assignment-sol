import java.util.*;

class Solution {

    public int findLHS(int[] nums) {

        int longestSubsequence = 0;
        for (int i = 0; i < nums.length; i++) {
            int countNum = 0;
            int countNumPlusOne = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    countNum++;
                } else if (nums[j] == nums[i] + 1) {
                    countNumPlusOne++;
                }
                if (countNum != 0 && countNumPlusOne != 0) {
                    longestSubsequence = Math.max(longestSubsequence, countNum + countNumPlusOne);
                }

            }
        }

        return longestSubsequence;

    }
}

class Solution2 {

    public int findLHS(int[] nums) {

        Arrays.sort(nums);

       int LSS = 0;
       int i = 0;
       int j = 0;
       int countNum = 0;
       int countNumPlusOne = 0;
       while(i< nums.length){
           if( j == nums.length){
               return LSS;
           }
           if(nums[j] == nums[i]){
               countNum++;
               j++;
           }else if ( nums[j] == nums[i]+1){
               countNumPlusOne++;
                j++;
           }else{
               i++;
               j = i;
               countNum =0;
               countNumPlusOne =0;
           }
           if(countNum != 0 && countNumPlusOne != 0){
                LSS = Math.max(LSS, countNum+countNumPlusOne); 
           }
       }
       return LSS;
        
    }
}

public class Ques_3 {
    public static void main(String[] args) {

        // Question 3
        // We define a harmonious array as an array where the difference between its
        // maximum value
        // and its minimum value is exactly 1.

        // Given an integer array nums, return the length of its longest harmonious
        // subsequence
        // among all its possible subsequences.

        // A subsequence of an array is a sequence that can be derived from the array by
        // deleting some or no elements without changing the order of the remaining
        // elements.

        // Example 1:
        // Input: nums = [1,3,2,2,5,2,3,7]
        // Output: 5

        // Ans 1 = Solution (Time complexity O(n^2) && Space Complexity O(1))
        // Ans 2 = Solution (Time complexity O(n log (n)) &&  Space Complexity O(n log(n)))

    }
}
