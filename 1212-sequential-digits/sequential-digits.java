class Solution {
    // public int find(int[] arr,int x){
    //     int low=0,high=arr.length-1;
    //     int ans=-1;
    //     while(low<=high){
    //         int mid=(low+high)/2;
    //         if(arr[mid]>=x){
    //           ans=mid;
    //           high=mid-1;
    //         }else{
    //             low=mid+1;
    //         }
    //     }
    //     return ans;
    // }
    // public int find2(int[] arr,int x){
    //     int ans=-1;
    //     int low=0,high=arr.length-1;
    //     while(low<=high){
    //         int mid=(low+high)/2;
    //         if(arr[mid]<=x){
    //             ans=mid;
    //             low=mid+1;
    //         }else{
    //             high=mid-1;
    //         }
    //     }
    //     return ans;
    // }
    public List<Integer> sequentialDigits(int low, int high) {
         List<Integer> li=new ArrayList<>();
        String s="123456789";
        String a=String.valueOf(low);
        String b=String.valueOf(high);
        for(int i=a.length();i<=b.length();i++){
            for(int j=0;j<=s.length()-i;j++){
                String x=s.substring(j,j+i);
                int c=Integer.parseInt(x);
                if(c>=low && c<=high){
                    li.add(c);
                }
            }
        }
        
        return li;
    //     List<Integer> li=new ArrayList<>();
    //     int[] sequential = {
    //     12, 23, 34, 45, 56, 67, 78, 89,
    //     123, 234, 345, 456, 567, 678, 789,
    //     1234, 2345, 3456, 4567, 5678, 6789,
    //     12345, 23456, 34567, 45678, 56789,
    //     123456, 234567, 345678, 456789,
    //     1234567, 2345678, 3456789,
    //     12345678, 23456789,
    //     123456789
    // };
    //     int s=find(sequential,low);
    //     int d=find2(sequential,high);
    //     if (s == -1 || d == -1 || s > d) {
    //     return li;
    // }
    //     for(int i=s;i<=d;i++){
    //         li.add(sequential[i]);
    //     }
    //     return li;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna