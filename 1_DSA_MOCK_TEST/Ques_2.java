class Solution {
    public int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return i;
            }
        }

        return -1;

    }
}

public class Ques_2 {

    public static void main(String[] args) {

    }

}
