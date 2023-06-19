
class Solution {

    public int removeAllOccurence(int[] nums, int val) {

        int i = 0;
        int j = nums.length - 1;

        if (nums.length == 1) {
            if (nums[0] == val) {
                return 0;
            } else {
                return 1;
            }
        }

        // compare elements of array with index i with val
        // if it is equal to val then check the Element of array with index j
        // if val and Element at index j match decrement the j else swap the elements

        while (i <= j) {
            if (nums[i] == val) {
                if (nums[i] == nums[j]) {
                    j--;
                } else {

                    // Swapping the numbers
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            } else {
                i++;
            }
        }

        return i;

    }
}

public class Ques_2 {
    public static void main(String[] args) {
        // Q2. Given an integer array nums and an integer val, remove all occurrences of
        // val in nums in-place. The order of the elements may be changed. Then return
        // the number of elements in nums which are not equal to val.

        // Ans :=> In solution class

    }

}
