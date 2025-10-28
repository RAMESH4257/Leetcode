class Solution {
    public int[] shuffle(int[] nums, int n) {
        int idx=0;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length/2;i++){
            res[idx++]=nums[i];
            res[idx++]=nums[i+n];
        }
        return res;
    }
}