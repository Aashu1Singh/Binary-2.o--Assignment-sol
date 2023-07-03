class Solution {

    public String shiftOne(String str) {
        
        char first = str.charAt(0);
        str = str.substring(1);
        str = str + first;

        return str;
    }

    public boolean rotateString(String s, String goal) {

        int i = 0;
        int len = s.length();
        if (s.length() != goal.length()) {
            return false;
        }
        while (i < len) {
            int j = 0;

            boolean flag = true;
            while (j < len) {
                if (s.charAt(j) != goal.charAt(j)) {
                    flag = false;
                    // System.out.println("op");
                    break;
                }
                j++;
            }
            if (flag) {
                return true;
            }
            s = shiftOne(s);
            i++;
        }

        return false;

    }
}

public class Ques_6 {

    public static void main(String[] args) {

    }
}
