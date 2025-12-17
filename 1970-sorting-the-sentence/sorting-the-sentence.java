class Solution {
    public String sortSentence(String s) {
       //String s="This1 Sentence4 is2 good3";
       StringBuilder sb=new StringBuilder();
        String arr[]=s.split(" ");
        HashMap<Integer,String> hm=new HashMap<>();
        for(String word:arr) {
            int k=0;
            String ans = "";
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (Character.isDigit(ch)) {
                    k = ch - '0';
                } else {
                    ans += ch;
                }
            }
            hm.put(k,ans);
        }
        String result="";
       for(int i=1;i<=hm.size();i++){
        result+=hm.get(i)+" ";
       }
       return result.trim();
 
    }
}