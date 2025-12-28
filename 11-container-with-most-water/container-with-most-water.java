class Solution {
    public int maxArea(int[] height) {
    //   int max=0;
    //    //int[] height = {1,1};
    //    for(int i=0;i<height.length;i++){
    //        for(int j=i+1;j<height.length;j++){
    //            int min=Math.min(height[i],height[j]);
    //            int l=j-i;
    //            int k=min*l;
    //            max=Math.max(k,max);
    //        }
    //    } 
    // optimal--two pointers
    int max=0;
           int l=0;
           int r=height.length-1;
           while(l<r){
               int w=r-l;
               int h=Math.min(height[l],height[r]);
               int maxwtaer=h*w;
               max=Math.max(max,maxwtaer);
               if(height[l]<height[r]){
                   l++;
               }else{
                   r--;
               }
           }
       return max; 
    }
}