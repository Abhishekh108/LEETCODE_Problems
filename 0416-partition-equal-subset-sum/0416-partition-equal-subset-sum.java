class Solution {

    public boolean canPartition(int[] nums) {

        int totalSum = 0;

        // Find total sum
        for (int num : nums) {
            totalSum += num;
        }

        // Odd sum cannot be divided equally
        if (totalSum % 2 != 0) {
            return false;
        }

        int targetSum = totalSum / 2;
        int n = nums.length;

        // dp[i][sum] = can we make 'sum' using first i elements?
        boolean[][] dp = new boolean[n + 1][targetSum + 1];

        // Sum 0 is always possible
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // First row is already false for sum > 0
        // because 0 elements cannot make a positive sum

        for (int i = 1; i <= n; i++) {

            int currentNumber = nums[i - 1];

            for (int sum = 1; sum <= targetSum; sum++) {

                // Don't take current number
                dp[i][sum] = dp[i - 1][sum];

                // Take current number
                if (currentNumber <= sum) {
                    dp[i][sum] = dp[i][sum]
                            || dp[i - 1][sum - currentNumber];
                }
            }
        }

        return dp[n][targetSum];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna