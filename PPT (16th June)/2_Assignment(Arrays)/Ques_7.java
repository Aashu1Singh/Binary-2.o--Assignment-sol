class Solution {
    public boolean isMonotonic(int[] nums) {

        int i = 0;
        int n = nums.length;

        boolean iMonotonic = true;
        boolean dMonotonic = true;

        while (i < n - 1) {
            if (nums[i + 1] < nums[i]) {
                iMonotonic = false;
            }
            i++;
        }

        if (iMonotonic) {
            return true;
        }

        int j = 0;

        while (j < n - 1) {
            if (nums[j + 1] > nums[j]) {
                dMonotonic = false;
            }
            j++;
        }

        System.out.println(iMonotonic);
        System.out.println(dMonotonic);

        return (iMonotonic || dMonotonic);

    }
}

public class Ques_7 {

    public static void main(String[] args) {

        // Q) 7

        // An array is monotonic if it is either monotone increasing or monotone
        // decreasing.

        // An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
        // An array nums is
        // monotone decreasing if for all i <= j, nums[i] >= nums[j].

        // Given an integer array nums, return true if the given array is monotonic, or
        // false otherwise.



        // Answer in solution class 

    }
}
