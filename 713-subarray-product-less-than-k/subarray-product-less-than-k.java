class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        
        int l=0,r=0,c=0;
        long prod=1;
        while(r<nums.length){
          prod=prod*nums[r];
          while(prod>=k){
            prod=prod/nums[l];
            l++;
          }
          c+=r-l+1;
          r++;
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna