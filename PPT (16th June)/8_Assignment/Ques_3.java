class Solution {
    public int minDistance(String word1, String word2) {

        int i = 0;
        int j = 0;
        int len2 = word2.length();
        int step = 0;
        if (word2.contains(word1) && word1.contains(word2)) {
            return 0;
        }

        while (i < word1.length()) {
            if (word2.contains(word1)) {
                int index = word2.indexOf(word1);

                if (word2.contains(word1) && word1.contains(word2)) {
                    return step;
                }
                index = index + word1.length();
                step = step + word2.length() - word1.length();
                word2 = word2.substring(0, index);

            } else {
                word1 = word1.substring(1);
                step++;
            }
            i++;
            System.out.println(word1);
            System.out.println(word2);

        }

        if (word1.length() == 0) {
            step = step + word2.length();
        }

        return step;

    }
}

public class Ques_3 {

}