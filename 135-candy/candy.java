class Solution {
    public int candy(int[] ratings) {
        // optimal using slope concept
        int n=ratings.length;
        int sum=1,i=1;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                sum++;
                i++;
                continue;
            }
            int peak=1;
            while(i<n && ratings[i]>ratings[i-1]){
              peak++;
              i++;
              sum+=peak;
            }
            int down=1;
            while(i<n && ratings[i]<ratings[i-1]){
                sum+=down;
                i++;
                down++;
            }
            if(down>peak){
                sum+=(down-peak);
            }
        }
        return sum;
        // int[] left=new int[n];
        // int[] right=new int[n];
        // left[0]=1;
        // right[n-1]=1;
        // for(int i=1;i<n;i++){
        //     if(ratings[i]>ratings[i-1]){
        //         left[i]=left[i-1]+1;
        //     }else{
        //         left[i]=1;
        //     }
        // }
        // for(int i=n-2;i>=0;i--){
        //     if(ratings[i]>ratings[i+1]){
        //         right[i]=right[i+1]+1;
        //     }else{
        //         right[i]=1;
        //     }
        // }
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum+=(Math.max(left[i],right[i]));
        // }
        // return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna