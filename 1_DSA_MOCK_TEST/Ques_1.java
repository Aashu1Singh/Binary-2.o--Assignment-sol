class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = 1;
        int len = nums.length;
        if (len == 0) {
            return;
        }

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

public class Ques_1 {

    public static void main(String[] args) {

        // Ans  ==>>> moveZeroes();

    }

}
