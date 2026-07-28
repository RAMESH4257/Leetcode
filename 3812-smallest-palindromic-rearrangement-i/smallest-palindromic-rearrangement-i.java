class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1) return s;
        StringBuilder ans=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        
        if(s.length()%2!=0){

           for(int i=0;i<s.length()/2;i++){
              sb1.append(s.charAt(i));
           }
           char[] arr1=sb1.toString().toCharArray();
           Arrays.sort(arr1);
           ans.append(arr1);
           ans.append(s.charAt(s.length()/2));
           for(int i=arr1.length-1;i>=0;i--){
            ans.append(arr1[i]);
           }
        }else{
           for(int i=0;i<s.length()/2;i++){
             sb1.append(s.charAt(i));
           }
           char[] arr1=sb1.toString().toCharArray();
           Arrays.sort(arr1);
           ans.append(arr1);
            for(int i=arr1.length-1;i>=0;i--){
              ans.append(arr1[i]);
           }
           
        }
        return ans.toString();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna