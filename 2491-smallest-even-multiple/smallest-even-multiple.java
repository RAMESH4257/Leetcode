class Solution {
    public int smallestEvenMultiple(int n) {
        // int min=Integer.MAX_VALUE;
        // for(int i=1;i<=5;i++){
        //     int k=n*i;
        //     if(k%2==0){
        //        min=Math.min(k,min);
        //     }
        // }
        int min=0;
        if(n%2==0){
            min=n;
        }else{
            min=n*2;
        }
        return min;
    }
}