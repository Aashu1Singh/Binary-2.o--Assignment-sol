class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int i = 0;

        int beds = flowerbed.length;

        if (beds == 1) {
            if (flowerbed[0] == 0) {
                flowerbed[0] = 1;
                n--;
            }
            i++;
        }

        boolean flag = false;
        while (i <= beds - 1) {

            if (flowerbed[i] == 0) {
                if (i == 0) {

                    if (flowerbed[i + 1] == 0) {
                        flag = true;
                    }

                } else if (i == beds - 1) {

                    if (flowerbed[i - 1] == 0) {
                        flag = true;
                    }

                } else {

                    if ((flowerbed[i + 1]) == 0 && (flowerbed[i - 1] == 0)) {
                        flag = true;
                    }

                }
            }
            if (flag) {
                flowerbed[i] = 1;
                n--;
                flag = false;
            }
            if (n == 0) {
                return true;
            }
            i++;

        }

        boolean ans = n <= 0 ? true : false;

        return ans;

    }
}

public class Ques_4 {

    public static void main(String[] args) {

        // Q 4)

        // You have a long flowerbed in which some of the plots are planted, and some
        // are not.
        // However, flowers cannot be planted in adjacent plots.
        // Given an integer array flowerbed containing 0's and 1's, where 0 means empty
        // and 1 means not empty, and an integer n, return true if n new flowers can be
        // planted in the flowerbed without violating the no-adjacent-flowers rule and
        // false otherwise.

        // Example 1:
        // Input: flowerbed = [1,0,0,0,1], n = 1
        // Output: true

        // Answer ==>>>>>>>>>>> Solution 

    }

}
