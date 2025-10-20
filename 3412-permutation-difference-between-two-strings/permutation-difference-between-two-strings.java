class Solution {
    public int findPermutationDifference(String s, String t) {
      int sum=0;
       for(int i=0;i<s.length();i++){
           for(int j=0;j<t.length();j++){
           char ch1=s.charAt(i);
           char ch2=t.charAt(j);
           if(ch1==ch2){
               sum+=Math.abs(i-j);
           }
           }
       }
       return sum;
    }
}