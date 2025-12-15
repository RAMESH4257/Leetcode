class Solution {
    public int countAsterisks(String s) {
         int c=0;
        String result = s.replaceAll("\\|.*?\\|", "");
        System.out.println(result);
        for(int i=0;i<result.length();i++){
            char ch=result.charAt(i);
            if(ch=='*'){
                c++;
            }
        }
        return c;
    }
}