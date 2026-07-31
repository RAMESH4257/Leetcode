class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8) return word.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:word.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> li=new ArrayList<>(hm.entrySet());
        Collections.sort(li,(a,b)-> b.getValue()-a.getValue());
        int ans=0,c=0;
        for(Map.Entry<Character,Integer> mp:li){
          c++;
          if(c<=8){
            ans += mp.getValue() * 1;
          }else if(c>8 && c<=16){
            ans += mp.getValue() * 2;
          }else if(c>16 && c<=24){
           ans += mp.getValue() * 3;
          }else if(c>24 && c<=26){
            ans += mp.getValue() * 4;
          }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna