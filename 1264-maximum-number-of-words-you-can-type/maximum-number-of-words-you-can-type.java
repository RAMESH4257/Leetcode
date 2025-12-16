class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
       String arr[]=text.split(" ");
        int c=0;
        
        for(int i=0;i<arr.length;i++){
            boolean isValid=false;
            String s=arr[i];
            for(int j=0;j<brokenLetters.length();j++){
                char ch=brokenLetters.charAt(j);
                if(s.indexOf(ch)!=-1){
                    isValid=true;
                    break;
                }
            }
            if(isValid){
                c++;
            }
        }
        int c1=1;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch==' '){
                c1++;
            }
        }
        return c1-c; 
    }
}