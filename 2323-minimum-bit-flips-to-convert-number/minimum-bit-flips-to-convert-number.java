class Solution {
    public int minBitFlips(int start, int goal) {
        int val=start^goal;
        return Integer.bitCount(val);
        // String a=String.format("%31s",Integer.toBinaryString(start)).replace(' ','0');
        // String b=String.format("%31s",Integer.toBinaryString(goal)).replace(' ','0');
        // int c=0;
        // for(int i=0;i<a.length();i++){
        //     if(a.charAt(i)!=b.charAt(i)){
        //         c++;
        //     }
        // }
        // return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna