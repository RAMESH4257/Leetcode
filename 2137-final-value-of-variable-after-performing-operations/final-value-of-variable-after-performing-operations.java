class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c=0;
        for(int i=0;i<operations.length;i++){
            String s=operations[i]; 
            if(s.equals("--X")||s.equals("X--")){
                c--;
            }else{
                c++;
            }
        }
        return c;
    }
}