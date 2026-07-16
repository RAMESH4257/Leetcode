class Solution {
    public int longestMountain(int[] arr) {
        int[] inc=new int[arr.length];
        inc[0]=1;
        int[] dec=new int[arr.length];
        dec[arr.length-1]=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                inc[i]=inc[i-1]+1;
            }else{
                inc[i]=1;
            }
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                dec[i]=dec[i+1]+1;
            }else{
                dec[i]=1;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             if (inc[i] > 1 && dec[i] > 1) {
               max = Math.max(max, inc[i] + dec[i] - 1);
            }
        }
        if(max>=3){
            return max;
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna