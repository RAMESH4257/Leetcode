class Solution {
    public int largestInteger(int[] nums, int k) {
        if(k>nums.length) return -1;
        int[] freq=new int[52];
        for(int i=0;i<=nums.length-k;i++){
            boolean[] seen=new boolean[51];
            for(int j=i;j<i+k;j++){
                if(!seen[nums[j]]){
                    freq[nums[j]]++;
                    seen[nums[j]]=true;
                }
            }
        }
        int max=-10000;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                if(max<i){
                    max=i;
                }
            }
        }
        if(max==-10000) return -1;
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna