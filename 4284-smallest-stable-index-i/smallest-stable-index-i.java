class Solution {
    public int find(int[] nums,int st){
        int min=Integer.MAX_VALUE;
        for(int i=st;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        return min;
    }
    public int firstStableIndex(int[] nums, int k) {
        int max=-1,minidx=Integer.MAX_VALUE,minval=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            int min=find(nums,i);
            if(max-min<=k){
               minidx=Math.min(minidx,i);
            }
        }
        if(minidx==2147483647) return -1;
        return minidx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna