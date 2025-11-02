class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      int[] ans=new int[2];
        int idx=0;
        int n=(grid.length)*(grid.length);
        HashSet<Integer> hs=new HashSet<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int k=grid[i][j];
                hm.put(k,hm.getOrDefault(k,0)+1);
                hs.add(k);
            }
        }
        for(int i: hm.keySet()){
            int k=hm.get(i);
            //System.out.println(k);
            if(k>=2){
                ans[idx++]=i;
            }
        }
        for(int j=1;j<=n;j++){
            if(!hs.contains(j)){
                ans[idx++]=j;
            }
        }
        return ans;  
    }
}