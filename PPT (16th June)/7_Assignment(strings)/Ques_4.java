class Solution {
    public String reverse(String str) {
        if (str.length() == 0) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public String reverseWords(String s) {
        int index = 0;
        int i = 0;
        while (i < s.length()) {
            index = s.indexOf(' ', i);
            if (index == -1) {
                break;
            }
            StringBuilder reversed = new StringBuilder(s.substring(i, index));
            reversed = reversed.reverse();
            String reversedString = reversed.toString();
            s = s.substring(0, i) + reversedString + s.substring(index);
            i = index + 1;
        }

        StringBuilder reversed = new StringBuilder(s.substring(i));
        reversed = reversed.reverse();
        String reversedString = reversed.toString();
        s = s.substring(0, i) + reversedString;

        return s;
    }
}

public class Ques_4 {
    public static void main(String[] args) {

    }
}
