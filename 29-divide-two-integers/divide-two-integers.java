class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor) return 1;
        boolean sign=true;
        if(dividend>=0 && divisor<0 || dividend<0 && divisor>0) sign=false;
        long n=Math.abs((long) dividend);
        long d=Math.abs((long) divisor);
        long ans=0;
        while(n>=d){
            int cnt=0;
            while(n>=(d<<(cnt+1))){
                cnt++;
            }
            // 2 powers 
            ans+=(1L<<cnt);
            n=n-(d<<cnt);
        }
        if (ans > Integer.MAX_VALUE) {
            return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return sign ? (int) ans : -(int) ans;
        // if(dividend==divisor) return 1;
        // if(dividend==Integer.MAX_VALUE && divisor==-1) return Integer.MIN_VALUE;
        // if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        // boolean isPositive=!((dividend>0 && divisor<0) || (dividend<0 && divisor>0));
        // long n=Math.abs((long)dividend);
        // long d=Math.abs((long)divisor);
        // long ans=0;
        // while(n>=d){
        //     n-=d;
        //     ans++;
        // }
        // if (ans > Integer.MAX_VALUE)
        //     return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        // return isPositive ? (int) ans : (int) -ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna