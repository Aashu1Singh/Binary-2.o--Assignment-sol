import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int check[] = new int[nums.length+1];

        for(int i = 0; i<nums.length; i++){
            int index = nums[i];
            check[index]++;
        }

        for(int i = 0; i<check.length; i++){
           if(check[i] == 2){
               ans.add(i);
           }
        }

        return ans;
    }
}
public class Ques_6 {
    public static void main(String[] args) {
        
    }
    
}
