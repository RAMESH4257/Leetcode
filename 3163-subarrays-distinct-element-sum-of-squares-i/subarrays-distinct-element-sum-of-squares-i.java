class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            Set<Integer> hs=new HashSet<>();
            for(int j=i;j<nums.size();j++){
                hs.add(nums.get(j));
                int k=hs.size();
                sum+=(k*k);
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna