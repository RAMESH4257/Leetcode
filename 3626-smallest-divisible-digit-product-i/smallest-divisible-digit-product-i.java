class Solution {
    public boolean check(int n,int d){
        int prod=1;
        while(n!=0){
            int r=n%10;
            prod*=r;
            n/=10;
        }
        return prod%d==0;
    }
    public int smallestNumber(int n, int t) {
        if(n%10==0) return n;
        int prod=1;
        int copy=n;
        while(n!=0){
            int r=n%10;
            prod*=r;
            n/=10;
        }
        n=copy;
        if(prod%t==0) return n;
        for(int i=n+1;i<=100;i++){
            if(check(i,t)){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna