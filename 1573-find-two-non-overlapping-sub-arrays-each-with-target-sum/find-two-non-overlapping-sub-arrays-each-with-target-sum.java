class Solution {

    public int rightmost(List<Integer> li,int x){
        int ans=-1;
        int l=0,h=li.size()-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(li.get(mid)<x){
               ans=mid;
               l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
    public int minSumOfLengths(int[] arr, int target) {
        List<Integer> end=new ArrayList<>();
        List<Integer> best=new ArrayList<>();
        int answer=Integer.MAX_VALUE;
        int l=0,r=0,sum=0;
        while(r<arr.length){
            sum+=arr[r];
            while(sum>target){
                sum-=arr[l];
                l++;
            }
            if(sum==target){
                int currlen=r-l+1;
                int idx=rightmost(end,l);
                if(idx!=-1){
                    answer=Math.min(answer,currlen+best.get(idx));
                }
                
                end.add(r);
                if(best.isEmpty()){
                    best.add(currlen);
                }else{
                    int min=Math.min(best.get(best.size()-1),currlen);
                    best.add(min);
                }
            }
            r++;
        }
        return answer==Integer.MAX_VALUE?-1:answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna