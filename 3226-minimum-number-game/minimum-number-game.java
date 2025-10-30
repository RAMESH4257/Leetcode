class Solution {
    public int[] numberGame(int[] nums) {
       int idx=0;
        Arrays.sort(nums);
        int arr[]=new int[nums.length];
        //int idx=0;
        for(int i=0;i< nums.length-1;i++){
            int a=nums[i];
            int b=nums[i+1];
            i+=1;
            arr[idx++]=b;
            arr[idx++]=a;
        }
        return arr;
    }
}