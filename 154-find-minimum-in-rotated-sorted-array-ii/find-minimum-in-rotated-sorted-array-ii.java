class Solution {
    public int findMin(int[] nums) {
        //  int min=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //    min=Math.min(min,nums[i]);
        // }
        // return min;
    // BINARY_SEARCH
    int l=0;
        int h=nums.length-1;
        while(l!=h){
            int mid=l+(h-l)/2;
            if(nums[mid]<nums[h]){
                h=mid;
            }else if(nums[mid]==nums[h]){
                     h--;
            }else{
                l=mid+1;
            }
        }
        return nums[l];
    }
}