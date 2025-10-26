class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String s : words) {
            boolean isValid = true;
            for (int i = 0; i < s.length(); i++) {
                if (allowed.indexOf(s.charAt(i)) == -1) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) count++;
        }
        return count;
    }
}