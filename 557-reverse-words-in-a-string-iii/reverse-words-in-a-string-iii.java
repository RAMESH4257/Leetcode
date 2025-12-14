class Solution {
    public String reverseWords(String s) {
         String[] arr=s.split(" ");
        String ans="";
        for(String i:arr){
            String k=i;
            for(int j=k.length()-1;j>=0;j--){
                char ch=k.charAt(j);
                ans+=ch;
            }
            ans+=" ";
//            System.out.print(i+" ");
        }
        return ans.trim();
    }
}