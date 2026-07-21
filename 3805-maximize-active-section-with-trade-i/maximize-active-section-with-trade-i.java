class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones=0;
        for(char ch:s.toCharArray()){
            if(ch=='1') ones++;
        }
        
        
        String val="1"+s+"1";
        int c=0;
        int st=-1,end=-1,max=Integer.MIN_VALUE;
        
        List<int[]> li=new ArrayList<>();
        int i=0;
        // divide a block and put in list like{digit,size}
       
        while(i<val.length()){
            char ch=val.charAt(i);
            int j=i;
            while(j<val.length() && val.charAt(j)==ch){
                j++;
            }
            int k=val.charAt(i)-'0';
            li.add(new int[]{k,j-i});
            i=j;
        }
        //int max=Integer.MIN_VALUE;
        i=0;
        for(i=0;i<li.size();i++){
            // checking every block whic has maximum
            if(li.get(i)[0]==1){
                if(i!=0 && li.get(i-1)[0]==0){
                    if(i!=li.size()-1 &&li.get(i+1)[0]==0){
                        int left=li.get(i-1)[1];
                        int right=li.get(i+1)[1];
                       max=Math.max(max,left+right+ones);
                    }
                }
            }
        }
        // if no '1's block boundary at '0' s then answer is number of ones
        if(max==-2147483648){
            return ones;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna