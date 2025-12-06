class Solution {
    public int[] getConcatenation(int[] nums) {
       int n=nums.length;
        int[] copy=new int[n];
        int c=0;
        int arr[]=new int[n*2];
        for(int i=0;i<nums.length;i++){
            copy[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            c++;
        }
        for(int i=0;i<copy.length;i++){
            arr[c]=copy[i];
            c++;
        }
        return arr;
    }
}