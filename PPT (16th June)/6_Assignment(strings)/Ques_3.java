class Solution {

    public boolean strictlyDecresing(int[] arr, int index) {
        int l = arr.length - 1;
        if (index == 0) { // if index is 1 then definately it is not arrray mountain
            return false;
        }
        while (index < l) {
            if (arr[index + 1] >= arr[index]) {
                return false;
            }
            index++;
        }
        return true;

    }

    public boolean validMountainArray(int[] arr) {

        int len = arr.length;
        if (len < 3) {
            return false;
        }

        int i = 0;
        boolean ans = false;
        while (i < len - 1) {
            if (arr[i + 1] > arr[i]) {
                i++;
            } else {
                boolean temp = strictlyDecresing(arr, i);
                return temp;
            }

        }
        return ans;

    }
}

public class Ques_3 {

    public static void main(String[] args) {

    }

}
