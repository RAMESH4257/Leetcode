class Solution {
    public int longestSubsequence(int[] nums) {
        if(nums.length==1 && nums[0]==0) return 0;
        int xor=0,zeros=0,lim=0;
        boolean allzeros=true;
        for(int i:nums){
            if(i!=0 && lim==0){
             allzeros=false;
             lim++;
            }
            xor^=i;
        }
        if(allzeros) return 0;
        if(xor!=0) return nums.length;
       return nums.length-1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna