class Solution {
    public int[] findOriginalArray(int[] changed) {

        int ans[] = new int[changed.length / 2];
        int k = 0;
        for (int i = 0; i < changed.length; i++) {
            int val = 2 * changed[i];

            for (int j = i + 1; j < changed.length && k < ans.length; j++) {

                if (changed[j] == val) {
                    ans[k] = changed[i];
                    k++;
                    break;
                }
            }
        }
        System.out.print(k);
        if (k != ans.length) {
            int temp[] = new int[0];
            return temp;
        }

        return ans;

    }
}

public class Ques_6 {

}
