class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        int r=0,l=0,maxlen=0;
        while(r<s.length()){
            if(hash[s.charAt(r)]!=-1){
                // if l to r that character is present or not
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            int len=r-l+1;
            maxlen=Math.max(maxlen,len);
            hash[s.charAt(r)]=r;
            r++;
        }
        return maxlen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna