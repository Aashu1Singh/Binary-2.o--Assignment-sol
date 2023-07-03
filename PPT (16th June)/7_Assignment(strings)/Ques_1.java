
import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();

        int i = 0;
        while (i < s.length()) {
            if (map.containsKey(s.charAt(i))) {
                char val = map.get(s.charAt(i));
                if (val != t.charAt(i)) {
                    return false;
                }
            } else {
                if (map.containsValue(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
            i++;
        }
        return true;

    }
}

public class Ques_1 {

}


