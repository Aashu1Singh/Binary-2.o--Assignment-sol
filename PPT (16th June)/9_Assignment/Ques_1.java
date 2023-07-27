
import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };
        int index = Arrays.binarySearch(nums, target);
        if (index >= 0) {
            int i = index;
            while (i >= 0 && nums[i] == target) {
                i--;
            }
            ans[0] = ++i;
            int j = index;
            while (j < nums.length && nums[j] == target) {
                j++;
            }
            ans[1] = --j;
        }

        return ans;

    }
}

public class Ques_1 {

    public static void main(String[] args) {

    }

}