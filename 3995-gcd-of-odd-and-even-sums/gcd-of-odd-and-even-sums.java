class Solution {
    public int cal(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int even=0,odd=0,c=0,num=0,num2=0;
       while(c!=n){
           
           odd+=1;
           
           even+=2;
           c++;
       }
       
       int val=cal(even,odd);
      return val;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna