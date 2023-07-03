class Solution {
    public String reverse(String str, int s, int e) {
        char[] charArray = str.toCharArray();
        while (s < e) {
            char temp = charArray[s];
            charArray[s] = charArray[e];
            charArray[e] = temp;
            s++;
            e--;
        }
        str = new String(charArray);
        return str;
    }

    public String reverseStr(String s, int k) {

        int remain = s.length();
        int i = 0;
        int j = s.length() - 1;
        while (remain > 0 && i < j) {
            if (remain >= 2 * k) {
                // reverse first k
                s = reverse(s, i, i + k - 1);
                remain -= 2 * k;
                i = i + 2 * k;
            } else if (remain < 2 * k && remain >= k) {
                // reverse first k

                s = reverse(s, i, i + k - 1);
                remain = remain - 2 * k;
                i = i + 2 * k;
            } else {
                // reverse the remaining
                s = reverse(s, i, j);
                break;
            }
        }
        return s;
    }
}

public class Ques_5 {

}
