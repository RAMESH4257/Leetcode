class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8) return word.length();
        if(word.length()<=16){
            int twos=word.length()-8;
            return 8+(twos*2);
        }
        if(word.length()==25){
            
            return (3*8)+8+16+4;
        }
        if(word.length()==26){
            return (3*8)+8+16+8;
        }
        if(word.length()>16){
            int threes=word.length()-16;
            return (threes*3)+8+16;
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna