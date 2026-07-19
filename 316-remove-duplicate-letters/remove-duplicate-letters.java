class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st=new Stack<>();
        int[] last=new int[26];
        boolean[] visited=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            last[ch-'a']=i;
        }
        

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }else{
                if(visited[ch-'a'])
                {
                    continue;
                }
                while(!st.isEmpty() && st.peek()>ch && last[st.peek()-'a']>i){
                    char ch2=st.pop();
                    visited[ch2-'a']=false;
                }
                    st.push(ch);
                
            }
            visited[ch-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna