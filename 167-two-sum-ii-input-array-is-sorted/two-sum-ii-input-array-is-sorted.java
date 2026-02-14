class Solution {
    public int[] twoSum(int[] numbers, int target) {
    //    for(int i=0;i<numbers.length-1;i++){
    //         for(int j=i+1;j<numbers.length;j++){
    //             if(numbers[i]+numbers[j]==target){
    //                 return new int[]{i+1,j+1};
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};  
    // 
     int l=0;
        int h=numbers.length-1;
        while(l<h){
            int sum=numbers[l]+numbers[h];
            if(numbers[l]+numbers[h]==target){
                return new int[]{l+1,h+1};
            }
            else if(sum<target){
                l++;
            }else{
                h--;
            }
        }
        return new int[]{-1,-1};
    }
}