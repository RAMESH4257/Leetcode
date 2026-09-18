class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int i:nums){
            total+=i;
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
         if(leftsum==total-leftsum-nums[i]){
            return i;
         }
         leftsum+=nums[i];
        }
        return -1;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna