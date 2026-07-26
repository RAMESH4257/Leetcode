class Solution {
    public int singleNumber(int[] nums) {

        int ones=0,twos=0;
        for(int i:nums){
            ones=(ones^i)&(~twos);
            twos=(twos^i)&(~ones);
        }
        return ones;
        // use hashmap -brute force;

        // int ans=0;
        // for(int bit=0;bit<32;bit++){
        //     int c=0;
        //     for(int i=0;i<nums.length;i++){
        //        if((nums[i]&(1<<bit))!=0){
        //         c++;
        //        }
        //     }
        //     if(c%3!=0){
        //         ans=ans|(1<<bit);
        //     }
        // }
        // return ans;

        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i=i+3){
        //     if(nums[i]!=nums[i-1]) return nums[i-1];
        // }
        // return nums[nums.length-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna