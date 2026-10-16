
import java.util.*;

class Solution {
    public int sumCounts(List<Integer> nums) {
        int total = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                set.add(nums.get(j));
                int count = set.size();
                total += count * count;
            }
        }

        return total;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna