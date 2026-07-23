class Solution {
    public int uniqueXorTriplets(int[] nums) {
       if(nums.length==1) return 1;
       if(nums.length==2) return 2;
       int k=nums.length;
       String s=Integer.toBinaryString(k);
       int ans=s.length();
       int finall=1;
      for(int i=0;i<ans;i++){
         finall*=2;
      }
      return finall;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna