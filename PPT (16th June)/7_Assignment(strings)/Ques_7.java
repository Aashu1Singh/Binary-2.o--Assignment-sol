class Solution {

    public String remove(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (j > 0 && i < j) {

            if (i >= str.indexOf('#')) {
                if (str.indexOf('#') == -1) {
                    return str;
                }
                int index = str.indexOf('#');
                String secondPart = str.substring(i + 1);
                str = secondPart;
                j--;
            } else if (j > 0 && str.charAt(i + 1) == '#') {
                String firstPart = str.substring(0, i);
                String secondPart = str.substring(i + 2);
                str = firstPart + secondPart;
                j = j - 2;
                if (i != 0) {
                    i--;
                }

            } else {
                i++;
            }
        }
        return str;

    }

    public boolean backspaceCompare(String s, String t) {

        s = remove(s);
        t = remove(t);
        if (s.length() != t.length()) {
            return false;
        }

        int i = 0;
        while (i < s.length()) {
            int iVal = s.charAt(i);
            int jVal = t.charAt(i);
            if (iVal != jVal) {
                return false;
            }
            i++;
        }

        return true;

    }
}

public class Ques_7 {

}
