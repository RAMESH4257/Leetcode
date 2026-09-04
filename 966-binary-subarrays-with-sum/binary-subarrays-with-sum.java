class Solution {
    public int find(int[] nums,int goal){
        if(goal<0) return 0;
        int l=0,r=0,sum=0;
        int c=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            c+=(r-l+1);
            r++;
        }
        return c;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        // nofsubbarrays sum == goal ==> sum<=goal - sum<=goal-1
        int a=find(nums,goal);
        int b=find(nums,goal-1);
        return a-b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna