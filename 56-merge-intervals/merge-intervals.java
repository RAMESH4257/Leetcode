class Solution {
    public int[] check(int[] arr1,int[] arr2){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        boolean poss=false;
        if(arr2[0]<=arr1[1]){
          min=Math.min(arr1[0],arr2[0]);
          max=Math.max(arr1[1],arr2[1]);
          poss=true;
        }
        if(poss) return new int[]{min,max};
        return new int[]{-1,0};
    }
    public int[][] merge(int[][] intervals) {
        List<int[]> li=new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        int[] first=intervals[0];
        li.add(first);
        for(int i=1;i<intervals.length;i++){
            int[] temp=check(first,intervals[i]);
            if(temp[0]!=-1){
                li.remove(li.size()-1);
                li.add(temp);
                first=temp;
                //i+=1;
            }else{
                //li.add(first);
                li.add(intervals[i]);
                 first = intervals[i];
            }
        }
       
        int[][] ans=new int[li.size()][2];
        for(int i=0;i<li.size();i++){
            ans[i]=li.get(i);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna