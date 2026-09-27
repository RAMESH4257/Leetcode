class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        if(source[0]==target[0] && source[1]==target[1]) return 0;
        if(source[0]==target[0] || source[1]==target[1]) return 1;
        int row=Math.abs(source[0]-target[0]);
        int col=Math.abs(source[1]-target[1]);
        if(row==col) return 1;
        int min=Integer.MAX_VALUE;
        //return Math.min(row,col)+1;
        return 2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna