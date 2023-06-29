class Solution {
    public int arrangeCoins(int n) {

        int ans = 0;
        int row = 1;
        while(n > 0){
            n = n-row;
            if( n  >= 0 ){
                ans++;
                row++;
            }else{
                break;
            }
            
        }

        return ans;
        
    }
}

public class Ques_5 {
    
    
}
