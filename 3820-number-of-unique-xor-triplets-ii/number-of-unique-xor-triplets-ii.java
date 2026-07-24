class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] pair = new boolean[2048];
        boolean[] triplet = new boolean[2048];
         for (int i = 0; i < nums.length; i++) {
          for (int j = i; j < nums.length; j++) {
            pair[nums[i] ^ nums[j]] = true;
        }
       }
        
         for (int x = 0; x < 2048; x++) {
            if (!pair[x]) continue;

            for (int num : nums) {
                triplet[x ^ num] = true;
            }
        }
         
        int c=0;
        for(int i=0;i<2048;i++){
            if(triplet[i]) c++;
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna