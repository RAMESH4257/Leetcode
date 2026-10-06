class Solution {
    public int scoreOfParentheses(String s) {
        if(s.length()<=2){
            return 1;
        }
       
        int ans=0,depth=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
               depth++;
            }else{
                depth--;
                if(s.charAt(i-1)=='('){
                    int val=1<<(depth);
                    ans+=val;
                }
            }
        }
        return ans;
       
    }
}