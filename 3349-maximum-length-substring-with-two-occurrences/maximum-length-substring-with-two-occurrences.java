class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int left=0, max=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            freq[ch-'a']++;
            while(freq[ch-'a']>2){
                char leftmost=s.charAt(left);
              freq[leftmost-'a']--;
              left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna