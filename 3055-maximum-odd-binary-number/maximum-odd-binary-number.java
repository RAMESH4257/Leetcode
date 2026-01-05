class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr=s.toCharArray();
        int zero=0;
        int ones=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                zero++;
            }else{
                ones++;
            }
        }
        int lastindex=s.length()-1;
        if(ones>=1){
               arr[lastindex]='1';
               ones--;//011 to 001
        }
        int idx=0;
        int c1=0;
        while(ones!=0){
            arr[idx]='1';
            idx++;
            c1++;
            ones--;
        }
        while(zero!=0){
            arr[c1]='0';
            c1++;
            zero--;
        }
//        for(int i=0;i<arr.length-1;i++){
//            arr[i]='0';
//            zero--;
//        }
        String ans=new String(arr);
        return ans;
    }
}