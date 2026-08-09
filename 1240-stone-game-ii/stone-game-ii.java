class Solution {
    int[][] dp;
    public int find(int idx,int m,int[] arr,int[] suff){
        if(idx==arr.length){
            return 0;
        }
        if(dp[idx][m]!=-1){
            return dp[idx][m];
        }
        int best=0;
        for(int x=1;x<=(2*m) && idx+x<=arr.length;x++){
        //   int taken=0;
        //   for(int j=idx;j<idx+x;j++){
        //     taken+=arr[j];
        //   }
          int opponent=find(idx+x,Math.max(m,x),arr,suff);
          int mystones=suff[idx]-opponent;
          best=Math.max(best,mystones);
        }
        dp[idx][m]=best;
        return best;
        
    }
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        int[] suff=new int[piles.length];
        suff[piles.length-1]=piles[piles.length-1];
        int sum=suff[piles.length-1];
        for(int i=piles.length-2;i>=0;i--){
           sum+=piles[i];
           suff[i]=sum;
        }
        dp=new int[n][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans=find(0,1,piles,suff);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna