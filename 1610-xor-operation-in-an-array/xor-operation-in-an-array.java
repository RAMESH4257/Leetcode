class Solution {
    public int xorOperation(int n, int start) {
        int last=0,ans=0,i=0;
        while(n!=0){
            ans=ans^(start+2*i);
            i++;
            n--;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna