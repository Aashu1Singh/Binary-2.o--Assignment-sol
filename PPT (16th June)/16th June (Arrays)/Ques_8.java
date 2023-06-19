class Solution {
    public int[] findMissingRepeatingNumbers(int[] a) {
        long n = a.length; // size of the array
        // Find Sn and SumOfSqOfNo:

        long SumOfNo = (n * (n + 1)) / 2;
        long SumOfSqOfNo = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate S and S2:
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += a[i];
            S2 += (long) a[i] * (long) a[i];
            System.out.println(S2);
        }

        // S-SumOfNo = X-Y:
        long val1 = S - SumOfNo;

        // S2-SumOfSqOfNo = X^2-Y^2:
        long val2 = S2 - SumOfSqOfNo;

        // Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2 / val1;

        // Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:

        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = { (int) x, (int) y };

        return ans;
    }
}

public class Ques_8 {

    public static void main(String[] args) {

        // Q 8 :
        // 💡 You have a set of integers s, which originally contains all the numbers
        // from 1 to n. Unfortunately, due to some error, one of the numbers in s got
        // duplicated to another number in the set, which results in repetition of one
        // number and loss of another number.

        

        // You are given an integer array nums representing the data status of this set
        // after the error.

        // Find the number that occurs twice and the number that is missing and return
        // them in the form of an array.



        // Ans : ==>>> solution class

    }

}
