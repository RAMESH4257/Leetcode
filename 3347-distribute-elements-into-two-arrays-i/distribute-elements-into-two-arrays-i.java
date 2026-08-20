class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> li1=new ArrayList<>();
        List<Integer> li2=new ArrayList<>();
        li1.add(nums[0]);
        li2.add(nums[1]);
        int idx=3;
        while(idx<=nums.length){
            if(li1.get(li1.size()-1)>li2.get(li2.size()-1)){
                li1.add(nums[idx-1]);
            }else{
                li2.add(nums[idx-1]);
            }
            idx++;
        }
        int[] ans=new int[nums.length];
        int j=0;
        for(int i:li1){
           ans[j]=i;
           j++;
        }
        for(int i:li2){
            ans[j]=i;
            j++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna