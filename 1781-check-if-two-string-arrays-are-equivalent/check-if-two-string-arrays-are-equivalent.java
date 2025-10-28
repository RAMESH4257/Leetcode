class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(String s:word1){
            //String k=s;
            sb.append(s);
        }
        for(String s:word2){
            //String k=s;
            sb1.append(s);
        }
        String a= sb.toString();
        String b=sb1.toString();
        return a.equals(b);
    }
}