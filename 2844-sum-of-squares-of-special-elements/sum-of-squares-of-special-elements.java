class Solution {
    public int sumOfSquares(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums.length%(i+1)==0){
                int s=nums[i]*nums[i];
                ans+=s;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna