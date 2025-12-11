class Solution {
    public String firstPalindrome(String[] words) {
         StringBuilder sb=new StringBuilder();
        for(String s:words){
            String k=s;
            int l=0;
            int r=k.length();
            boolean isValid=true;
            String ans="";
            for(int i=k.length()-1;i>=0;i--){
                char ch=k.charAt(i);
                ans+=ch;
            }
            if(ans.equals(k)) {
                sb.append(k);
                //System.out.println(k);
                break;
            }
        }
        return sb.toString();
    }
}