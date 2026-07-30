class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i:nums){
            if(i==0){
                return 0;
            }
            else if(i<0){
                i=i*-1;
                int dis=i-0;
                if(dis<min){
                    ans=i*-1;
                    min=dis;
                }
            }else{
               int dis=i-0;
                if(dis<=min){
                    ans=i;
                    min=dis;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna