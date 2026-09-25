class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int i:nums){
            total+=i;
        }
        int tar=total-x;
        int l=0,r=0;
        int c=0;
        int max=Integer.MIN_VALUE,sum=0;;
        while(r<nums.length){
          sum+=nums[r];
          while(sum>tar && l<=r){
            sum-=nums[l];
            l++;
          }
          if(sum==tar){
             max=Math.max(max,r-l+1);
          }
         // max=Math.max(max,r-l+1);
          r++;
        }
        if(max==Integer.MIN_VALUE) return -1;
        return nums.length-max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna