class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx;
        if (ruleKey.equals("type")) {
            idx = 0;
        } else if (ruleKey.equals("color")) {
            idx = 1;
        } else {
            idx = 2;
        }

        int c = 0;
        for (List<String> row : items) {
            String s = row.get(idx);
            if (s.equals(ruleValue)) {
                c++;
            }
        }

        return c;
    }
}