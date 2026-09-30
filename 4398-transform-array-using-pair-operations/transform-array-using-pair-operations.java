class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long s1=0,s2=0;
        for(int i:source){
            s1+=i;
        }
        for(int i:target){
            s2+=i;
        }
        return s1==s2;
    }
}