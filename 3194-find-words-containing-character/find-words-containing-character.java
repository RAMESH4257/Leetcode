class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> li=new ArrayList<>();
        //char chh=x.charAt(0);
        for(int i=0;i<words.length;i++){
            String word=words[i];
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                if(ch==x){
                    if(!li.contains(i)){
                        li.add(i);
                    }
                    //li.add(i);
                }
            }
            
        }
        return li;
    }
}