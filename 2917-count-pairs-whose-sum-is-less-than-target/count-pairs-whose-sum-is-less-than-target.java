class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int arr[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            arr[i]=nums.get(i);
        }
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]<target){
                    c++;
                }
            }
        }
        return c;

    }
}