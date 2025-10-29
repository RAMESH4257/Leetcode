class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       boolean isValid = true;

        HashMap<Character, Integer> hm1 = new HashMap<>(); 
        HashMap<Character, Integer> hm2 = new HashMap<>(); 

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
        }

       
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);
        }

        
        for (char ch : hm2.keySet()) { 
            if (!hm1.containsKey(ch)) {
                isValid = false; 
                break;
            } else {
                int a = hm1.get(ch);
                int b = hm2.get(ch); 

                if (a < b) { 
                    isValid = false;
                    break;
                }
            }
        }

        return isValid;
    }
}