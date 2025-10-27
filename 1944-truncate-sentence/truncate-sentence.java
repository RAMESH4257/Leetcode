class Solution {
    public String truncateSentence(String s, int k) {
        String []ans=s.split(" ");
        int c=0;
        StringBuilder sb=new StringBuilder();
        for(String ss:ans){
           String word=ss;
            sb.append(word);
            sb.append(" ");
                c++;
            if(c==k){
                break;
            }
        }
        String neww=sb.toString();
        String clean=neww.trim();
        return clean;
    }
}