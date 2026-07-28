class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
      HashMap<Integer,Integer> hm=new HashMap<>();
      for(int i=0;i<mat.length;i++){
        int c=0;
        for(int j=0;j<mat[i].length;j++){
           if(mat[i][j]==1){
            c++;
           }
        }
        hm.put(i,c);
      }
      List<Map.Entry<Integer,Integer>> li=new ArrayList<>(hm.entrySet());
      Collections.sort(li,(a,b)->{
        if(a.getValue() != b.getValue()){
            return a.getValue() - b.getValue();
        }
        return a.getKey() - b.getKey();
      });
      int[] ans=new int[k];
      int idx=0;
      for(Map.Entry<Integer,Integer> mp:li){
        if(idx==k) break;
        ans[idx]=mp.getKey();
        idx++;
      }
      return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna