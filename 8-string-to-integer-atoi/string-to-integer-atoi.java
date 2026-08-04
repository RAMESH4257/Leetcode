class Solution {
    public int myAtoi(String s) {
        boolean pos=true;
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                pos=false;
            }
            i++;
        }
        int ans=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int k=s.charAt(i)-'0';
            if(ans>(Integer.MAX_VALUE-k)/10){
                return pos?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            ans=ans*10+k;
            i++;
        }
        return pos?ans:ans*-1;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna