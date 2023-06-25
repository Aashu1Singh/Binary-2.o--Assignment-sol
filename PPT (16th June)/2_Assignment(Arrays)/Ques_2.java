import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {

        // Storing different types of candy
        Set<Integer> s = new HashSet<Integer>();
        for (int i : candyType) {
            s.add(i);
        }

        // total no of candy
        int size = s.size();

        int ans = Math.min(size, candyType.length / 2);

        return ans;

    }
}

public class Ques_2 {
    public static void main(String[] args) {
        // Q 2)
        // Alice has n candies, where the ith candy is of type candyType[i].
        // Alice noticed that she started to gain weight, so she visited a doctor.

        // The doctor advised Alice to only eat n / 2 of the candies she has (n is
        // always even). Alice likes her candies very much, and she wants to eat the
        // maximum number of different types of candies while still following the
        // doctor's advice.

        // Given the integer array candyType of length n, return the maximum number of
        // different types of candies she can eat if she only eats n / 2 of them.

        // Example 1:
        // Input: candyType = [1,1,2,2,3,3]
        // Output: 3


        // Answer ==>>>>>> Solution 
    }
}
