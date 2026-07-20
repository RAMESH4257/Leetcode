class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=grid.length,m=grid[0].length;
        
        int noofrows=grid.length;
        for(int i=0;i<n;i++){
            List<Integer> li=new ArrayList<>();
            for(int j=0;j<m;j++){
             li.add(0);
            }
            ans.add(li);
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
               // find idx in 1d array
               int idx=i*m+j;
               // idx+k like in 1d array
               int newidx=(idx+k)%(m*n);
               // find newrow
               int newrow=(newidx)/m;
               // find newcol
               int newcol=(newidx)%m;
               ans.get(newrow).set(newcol,grid[i][j]);

            }
        }
        return ans;


      
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna