class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=nums[nums.length-1];
        int[] arr=new int[nums.length];
        arr[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
           min=Math.min(min,nums[i]);
           arr[i]=min;
        }
        int minidx=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            int minele=arr[i];
            if(max-minele<=k){
                minidx=Math.min(i,minidx);
            }

        }
        if(minidx==2147483647) return -1;
        return minidx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna