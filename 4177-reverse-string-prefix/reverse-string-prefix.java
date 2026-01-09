class Solution {
    public String reversePrefix(String s, int k) {
        //String s = "xyz";
        StringBuilder sb=new StringBuilder();
        //int k=1;
        String ans="";
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            ans+=ch;
        }
        sb.append(ans);
        ans="";
        sb.reverse();
        ans+=sb.toString();

        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i);
            ans+=ch;
        }
        return ans;
    }
}