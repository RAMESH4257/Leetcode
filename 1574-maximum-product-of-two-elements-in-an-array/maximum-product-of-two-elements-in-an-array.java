class Solution {
    public int maxProduct(int[] nums) {
        int max1=0,max2=0;
        for(int i:nums){
            if(i>max1){
                max2=max1;
                max1=i;
            }else if(i>max2){
                max2=i;
            }
        }
        return (max1-1)*(max2-1);
        //  Arrays.sort(nums);
        // int n=nums.length;
        // return (nums[n-1]-1)*(nums[n-2]-1);
        //Arrays.sort(nums);
        // int prod=0,max=0;
        // for(int i=0;i<nums.length-1;i++){
        //     prod=((nums[i]-1)*(nums[i+1]-1));
        //     max=Math.max(max,prod);
        // }
        // return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna