class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Make a copy of the first m elements of nums1.
        int[] nums1Copy = new int[m];
        for (int i = 0; i < m; i++) {
            nums1Copy[i] = nums1[i];
        }
 
        // Read pointers for nums1Copy and nums2 respectively.
        int p1 = 0;
        int p2 = 0;
 
        // Compare elements from nums1Copy and nums2 and write the smallest to nums1.
        for (int p = 0; p < m + n; p++) {
            if (p2 >= n || (p1 < m && nums1Copy[p1] < nums2[p2])) {
                nums1[p] = nums1Copy[p1++];
            } else {
                nums1[p] = nums2[p2++];
            }
        }
    }
}


public class Ques_5 {

    public static void main(String[] args) {

        int nums1[] = {4 , 0, 0 , 0, 0, 0};
        int nums2[] = {1, 2, 3, 5 , 6};

        Solution s = new Solution();
        s.merge(nums1, 1, nums2, 5);

        for(int i: nums1){
            System.out.println(i);
        }
       
         
        
       
        
    }
    
}
