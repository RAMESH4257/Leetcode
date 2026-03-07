class Solution {
    static boolean check(int idx,int[][] mat,int row){
        for(int i=0;i<mat.length;i++){
            if(i==row) continue;
            if(mat[i][idx]==1){
                return false;
            }
        }
        return true;
    }
    public int numSpecial(int[][] mat) {
         int cnt=0;
        for(int i=0;i<mat.length;i++){
            int idx=0;
            int c=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1 ){
                    //isvalid=false;
                    c++;
                    idx=j;
                }
            }
            if(c==1){
               boolean ans=check(idx,mat,i);
               if(ans==true){
                   cnt++;
               }
            }
        }
        return cnt;
    }
}