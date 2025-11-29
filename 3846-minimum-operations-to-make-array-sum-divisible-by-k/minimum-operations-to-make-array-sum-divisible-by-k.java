class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        int sum=0;
//        Output: 4
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        while(sum%k!=0){
            if(sum<k){
                return sum;
            }
            if(sum%k==0){
                c=0;
            }else{
                c++;
                sum--;


            }
        }
        return c;

    }
}