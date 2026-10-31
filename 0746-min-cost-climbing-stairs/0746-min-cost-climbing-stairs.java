class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;

        int dp[]=new int [n];
        Arrays.fill(dp,-1);
      return  Math.min(mincost(cost,n-1,dp),mincost(cost,n-2,dp));
    }
    public int mincost(int cost[],int idx, int[]dp){
        if(idx==0) return cost[0];
        if(idx==1) return cost[1];
        if(dp[idx] !=-1) return dp[idx];
        dp[idx]= cost[idx]+Math.min(mincost(cost,idx-1,dp),mincost(cost,idx-2,dp));
        return dp[idx];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna