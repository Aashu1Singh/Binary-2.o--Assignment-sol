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

public class Ques_4 {
    public static void main(String[] args) {

    }
}
