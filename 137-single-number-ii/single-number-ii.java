class Solution {
    public int singleNumber(int[] nums) {
        // use hashmap -brute force;
        int ans=0;
        for(int bit=0;bit<32;bit++){
            int c=0;
            for(int i=0;i<nums.length;i++){
               if((nums[i]&(1<<bit))!=0){
                c++;
               }
            }
            if(c%3!=0){
                ans=ans|(1<<bit);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna