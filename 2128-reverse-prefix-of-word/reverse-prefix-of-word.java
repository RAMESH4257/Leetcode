class Solution {
    public static String rev(String k) {
        char[] arr = k.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
    }
    
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch); 
        if (idx == -1) return word; 
        String reversedPart = rev(word.substring(0, idx + 1));
        return reversedPart + word.substring(idx + 1);
    }
}
