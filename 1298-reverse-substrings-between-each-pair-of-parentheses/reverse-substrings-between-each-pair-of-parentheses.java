class Solution {
    void delete(StringBuilder te,Stack<Character> st){
        StringBuilder a=new StringBuilder();
        int j=te.length()-1;
        while(te.charAt(j)!='('){
            j--;
        }
        te.delete(j,te.length());
        
    }
    void add(StringBuilder sb,Stack<Character> st){
        for(char ch:sb.toString().toCharArray()){
            st.push(ch);
        }
    }
    public String reverseParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch!=')'){
            st.push(ch);
            ans.append(ch);
        }else{
            
            StringBuilder sb=new StringBuilder();
            while(!st.isEmpty()){
                char chh=st.pop();
                if(chh=='('){
                    break;
                }
                sb.append(chh);
            }
            delete(ans,st);
            add(sb,st);
            ans.append(sb);
        }
       }
        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna