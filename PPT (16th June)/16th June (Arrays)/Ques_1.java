class Solution {
    public int[] findIndexes(int[] nums, int target) {

        int[] ans = { -1, -1 };

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;

                }
            }
        }
        return ans;
    }
}

public class Ques_1 {
    public static void main(String[] args) {
        // Q1 Given an array of integers nums and an integer target, return indices of
        // the two numbers such that they add up to target.

        int arr[] = { 1, 3, 5, 6};
        int target = 8;

        Solution t = new Solution();
        int avg[] = t.findIndexes(arr, target);
        for(int i: avg){
            System.out.print(i + " ");
        }

    }
}