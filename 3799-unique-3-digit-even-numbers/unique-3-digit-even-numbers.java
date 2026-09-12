class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq=new int[10];
        for(int d:digits){
            freq[d]++;
        }
        int cnt=0;
        for(int i=100;i<=999;i++){
            int nums=i;


            int a=nums%10;
            nums/=10;
            int b=nums%10;
            nums/=10;
            int c=nums%10;
            nums/=10;

            int[] hash=new int[10];
            hash[a]++;
            hash[b]++;
            hash[c]++;

            boolean val=true;
            
            for(int j=0;j<=9;j++){
                if(hash[j]==0) continue;
              if(hash[j]>freq[j]){
                 val=false;
                 break;
              }
            }
            if(i%2==0 && val) cnt++;
        }
        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna