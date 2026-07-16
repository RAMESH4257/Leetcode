class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        long total=0;
         int max=Integer.MIN_VALUE;
         int[] arr=new int[nums.length];
         for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            int val=gcd(nums[i],max);
            arr[i]=val;
         }
         Arrays.sort(arr);
         int low=0,high=arr.length-1;
         while(low<high){
            long k=(long)gcd(arr[low],arr[high]);
            total+=k;
            low++;
            high--;
         }
         return total;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna