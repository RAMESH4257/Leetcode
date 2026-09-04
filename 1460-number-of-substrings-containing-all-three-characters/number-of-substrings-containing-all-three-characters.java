class Solution {
    public int numberOfSubstrings(String s) {
        int c=0;
        int[] lastseen={-1,-1,-1};
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            lastseen[ch-'a']=i;
            if(lastseen[0]!=-1 && lastseen[1]!=-1 && lastseen[2]!=-1){
                int min=Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2]));
                c+=min+1;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna