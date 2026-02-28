class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // int arr[]=new int[nums.size()];
        // for(int i=0;i<nums.size();i++){
        //     arr[i]=nums.get(i);
        // }
        // int c=0;
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]<target){
        //             c++;
        //         }
        //     }
        // }
        // OPTIMAL-TWO POINTERS
        int[] arr=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            arr[i]=nums.get(i);
        }
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        int c=0;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum<target){
                c+=r-l;
                l++;
            }else {
                r--;
            }
        }
        
        return c;

    }
}