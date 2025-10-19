class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             int a=('z'-ch)+1;
             k=a*(i+1);
             sum+=k;
             
            //  System.out.println(a);
            // System.out.println(k);
             
        }      
        
       return sum;
    }
}