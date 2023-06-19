import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {

        String str = "";
        // convert array of digits to string 
        for(int i: digits){
            str = str + i;
        }

        // store it into BigInteger and increase it by one 
        BigInteger num = new BigInteger(str);
        num = num.add(BigInteger.ONE);

        // convert back to string 
        String numberString = num.toString();

        int lengthS = numberString.length();

        // create array based on length of string 
        int ans[] = new int [lengthS];
        // System.out.println(numberString);

        // put digits back to array and return the array 
        for (int i = 0; i < numberString.length(); i++) {
            ans[i] = numberString.charAt(i) - 48;
        }

        return ans;

        
    }
}


public class Ques_4 {

    public static void main(String[] args) {
        // Q_4 :
        // 💡 You are given a large integer represented as an integer array digits,
        // where each digits[i] is the ith digit of the integer. The digits are ordered
        // from most significant to least significant in left-to-right order. The large
        // integer does not contain any leading 0's.

        // Increment the large integer by one and return the resulting array of digits.
        

        // Ans:===>>> Solution class 

    }

}
