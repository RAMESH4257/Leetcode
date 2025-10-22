class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int idx=0;
        HashSet<Integer> hs=new HashSet<>();
        int []res=new int[friends.length];
        for(int i=0;i<friends.length;i++){
            hs.add(friends[i]);
        }
        for(int i:order){
            if(hs.contains(i)){
                res[idx++]=i;
            }
        }
        return res;
    }
} 