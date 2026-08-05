class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length-1;i++){
           max=Math.max(max,nums[i+1]-nums[i]);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna