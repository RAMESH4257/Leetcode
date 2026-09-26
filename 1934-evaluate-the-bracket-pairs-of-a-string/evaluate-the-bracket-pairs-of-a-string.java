class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder ans=new StringBuilder();
        HashMap<String,String> hm=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            String a=knowledge.get(i).get(0);
            String b=knowledge.get(i).get(1);
            hm.put(a,b);
        }
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=')'){
              ans.insert(0,ch);
            }else{
                int j=i-1;
                StringBuilder temp=new StringBuilder();
                while(j>=0 && s.charAt(j)!='('){
                  temp.insert(0,s.charAt(j));
                  j--;
                }
                i=j;
                if(hm.containsKey(temp.toString())){
                    ans.insert(0,hm.get(temp.toString()));
                }else{
                    ans.insert(0,'?');
                }
            }
        }
        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna