class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int prefixsum=0;
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            int rem=prefixsum%k;
            if(hm.containsKey(rem)){
                int idx=hm.get(rem);
                if(i-idx>=2) return true;
            }else{
                hm.put(rem,i);
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna