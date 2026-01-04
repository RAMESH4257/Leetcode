class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // check next character safely
            if (i + 1 < s.length()) {
                char next = s.charAt(i + 1);

                if (ch == 'I' && next == 'V') {
                    sum += 4;
                    i++;
                } else if (ch == 'I' && next == 'X') {
                    sum += 9;
                    i++;
                } else if (ch == 'X' && next == 'L') {
                    sum += 40;
                    i++;
                } else if (ch == 'X' && next == 'C') {
                    sum += 90;
                    i++;
                } else if (ch == 'C' && next == 'D') {
                    sum += 400;
                    i++;
                } else if (ch == 'C' && next == 'M') {
                    sum += 900;
                    i++;
                } else {
                    sum += hm.get(ch);
                }
            } else {
                // last character
                sum += hm.get(ch);
            }
        }
        return sum;
    }
}