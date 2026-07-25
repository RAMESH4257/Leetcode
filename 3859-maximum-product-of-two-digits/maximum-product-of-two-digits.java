class Solution {
    public int maxProduct(int n) {
        
        String s=String.valueOf(n);
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        int a=arr[arr.length-1]-'0';
        int b=arr[arr.length-2]-'0';
        return a*b;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna