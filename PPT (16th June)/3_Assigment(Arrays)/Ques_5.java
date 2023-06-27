class Solution {
    public int[] plusOne(int[] digits) {

        int i = digits.length - 1;

        int carry = 0;

        while (i >= 0) {
            int val = digits[i] + carry;
            if (i == digits.length - 1) {
                val++;
            }
            int num = val % 10;
            carry = val / 10;
            digits[i] = num;
            i--;
        }
        if (carry == 0) {
            return digits;
        }

        // if function does not retun then it means all digits were 9s
        int[] ans2 = new int[digits.length + 1];
        ans2[0] = 1;
        return ans2;

    }
}

public class Ques_5 {
    public static void main(String[] args) {

        // 💡 **Question 5**
        // You are given a large integer represented as an integer array digits, where
        // each
        // digits[i] is the ith digit of the integer. The digits are ordered from most
        // significant
        // to least significant in left-to-right order. The large integer does not
        // contain any
        // leading 0's.

        // Increment the large integer by one and return the resulting array of digits.

        // **Example 1:**
        // Input: digits = [1,2,3]
        // Output: [1,2,4]

        // Answwer ====>>>>>>>>>>> Solution class

    }
}
