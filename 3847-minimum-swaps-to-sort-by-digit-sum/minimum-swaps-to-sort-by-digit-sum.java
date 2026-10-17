class Solution {
    public int digit_sum(int n){
        if(n<=9) return n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        int n=nums.length;
       int[][] arr=new int[n][2];
       for(int i=0;i<n;i++){
        arr[i][0]=nums[i];
        arr[i][1]=i;
       }
       Arrays.sort(arr,(a,b)->{
        int aa=digit_sum(a[0]);
        int bb=digit_sum(b[0]);
        if(aa!=bb){
            return aa-bb;
        }
         return a[0]-b[0];
       });

       int[] pos=new int[n];
       for(int i=0;i<n;i++){
        pos[arr[i][1]]=i;
       }

       int swaps=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i][1]==i){
            continue;
        }
        int tar=pos[i];
    
        int[] temp=arr[i];
        arr[i]=arr[tar];
        arr[tar]=temp;

        pos[arr[i][1]]=i;
        pos[arr[tar][1]]=tar;

        swaps++;
       }
       return swaps;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna