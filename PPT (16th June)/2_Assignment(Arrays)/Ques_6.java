class Solution {
    public int search(int[] nums, int target) {

        int s = 0;
        int e = nums.length - 1;
        int mid = e + (s - e) / 2;

        while (s <= e) {
            mid = e + (s - e) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}

public class Ques_6 {
    public static void main(String[] args) {

        // Q6)

        // Given an array of integers nums which is sorted in ascending order, and an
        // integer target,
        // write a function to search target in nums. If target exists, then return its
        // index. Otherwise,
        // return -1.
       

        // Ans ==>>>> Solution class 
    }
}
