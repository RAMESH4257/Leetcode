class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i:nums){
            xor=xor^i;
        }
        int rightmost=(xor&(xor-1))^xor;
        int b1=0,b2=0;
        for(int i:nums){
            if((i&rightmost)!=0){
                b1=b1^i;
            }else{
                b2=b2^i;
            }
        }
        int[] ans={b1,b2};
        //Arrays.sort(ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna