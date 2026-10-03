class Solution {
    public int helper(int n, int dp[]){
        if(n==0)return 0;
        if(dp[n]!=-1) return dp[n];
        int ans=n;
        for(int i=1;i*i<=n;i++){
            int count= 1+helper(n-i*i,dp);
            ans=Math.min(ans,count);
        }
        return dp[n]=ans;
    }
    public int numSquares(int n) {
        int dp[]=new int [n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        return helper(n,dp);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna