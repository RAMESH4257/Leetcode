class Solution {

    public boolean find(int st, int end, int[] nums, int sum1, int sum2, boolean turn) {

        if (st > end) {
            return sum1 >= sum2;
        }

        if (turn) { 
            return find(st + 1, end, nums, sum1 + nums[st], sum2, false)
                || find(st, end - 1, nums, sum1 + nums[end], sum2, false);
        } else { 
            return find(st + 1, end, nums, sum1, sum2 + nums[st], true)
                && find(st, end - 1, nums, sum1, sum2 + nums[end], true);
        }
    }

    public boolean predictTheWinner(int[] nums) {
        return find(0, nums.length - 1, nums, 0, 0, true);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna