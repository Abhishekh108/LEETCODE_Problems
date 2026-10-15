class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int dp[]= new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int i=0;i<coins.length;i++){ //coins arraay start with 0
            for(int curramt=coins[i];curramt<=amount;curramt++){
                dp[curramt]=Math.min(dp[curramt],1+dp[curramt-coins[i]]);
            }
        }
        return dp[amount]>amount? -1:dp[amount];
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna