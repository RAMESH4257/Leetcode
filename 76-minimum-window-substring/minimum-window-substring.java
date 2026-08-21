class Solution {
    public String minWindow(String s, String t) {
       if(s.length()<t.length()) return "";
       int[] hash=new int[256];
       for(char ch:t.toCharArray()){
        hash[ch]++;
       } 
       int minlen=Integer.MAX_VALUE;
       int stidx=-1,c=0,l=0,r=0;
       while(r<s.length()){
        if(hash[s.charAt(r)]>0){
            c++;
        }
        hash[s.charAt(r)]--;
        while(c==t.length()){
            if(r-l+1<minlen){
                minlen=r-l+1;
                stidx=l;
            }
            hash[s.charAt(l)]++;
            if(hash[s.charAt(l)]>0){
                c--;
            }
            l++;
        }
        r++;
       }
       if(stidx==-1) return "";
       return s.substring(stidx,stidx+minlen);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna