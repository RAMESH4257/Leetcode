class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        int n = nums.length;

        if (n == 1) {
            sum += nums[0];
        } else if (n % 2 == 0) {
            
            for (int i = 0; i < n - 1; i += 2) {
                int k = nums[i] - nums[i + 1];
                sum += k;
            }
        } else {
            int last = nums[0];
            for (int i = n - 1; i > 0; i -= 2) {
                int k = nums[i] - nums[i - 1];
                sum += k;
            }
            sum += last;
        }

        return sum;
    }
}