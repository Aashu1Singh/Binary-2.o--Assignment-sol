class Solution {
    public int searchInsert(int[] nums, int target) {

        int s = 0;
        int e = nums.length - 1;
        int mid = (s + e) / 2;

        while (s <= e) {
            mid = (s + e) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return s;

    }
}

public class Ques_3 {
    public static void main(String[] args) {

        // 💡 **Q3.** Given a sorted array of distinct integers and a target value,
        // return the index if the target is found. If not, return the index where it
        // would be if it were inserted in order.

        // Ans: > in solution class

    }

}
