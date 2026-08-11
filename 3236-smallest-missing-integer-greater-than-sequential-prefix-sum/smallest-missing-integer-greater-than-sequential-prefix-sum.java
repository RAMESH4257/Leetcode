class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length==1) return nums[0]+1;
       HashSet<Integer> hs=new HashSet<>();
       for(int i:nums){
        hs.add(i);
       } 
       int sum=nums[0];
       for(int j=1;j<nums.length;j++){
        if(nums[j]==nums[j-1]+1){
            sum+=nums[j];
        }else{
           break;
        }
       }
       while(hs.contains(sum)){
        sum++;
       }
       return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna