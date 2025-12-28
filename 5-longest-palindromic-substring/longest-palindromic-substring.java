class Solution {
    static  int max=0;
    static String ans="";
    public static void valid(String s1){
        int l=0;
        int r=s1.length()-1;
        //String a="";
        boolean isValid=true;
        while(l<r){
            char ch1=s1.charAt(l);
            char ch2=s1.charAt(r);
            if(ch1==ch2){
                l++;
                r--;
            }else{
                isValid=false;
                break;
            }
        }
        if(isValid && s1.length()>max){
            max=s1.length();
            ans=s1;
        }
    }
    public String longestPalindrome(String s) {
        //String s1="babad";
        max=0;
        ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String s1=s.substring(i,j);
                //System.out.println(s);
                valid(s1);
                //System.out.println(s);
            }
        }
        return ans;
    }
}