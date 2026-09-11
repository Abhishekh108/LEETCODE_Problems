class Solution {
    public int derangeCount(int n) {
        // code here
        int dp[]= new int [n+1];
        Arrays.fill(dp,-1);
        if( n==1) return 0; //1+1=2  dp[0] dp[1] but we have given dp[2]
        dp[1]=0;
        dp[2]=1;
        if(n>2){
        for(int i=3;i<=n;i++){
            dp[i]=(i-1)*(dp[i-2]+dp[i-1]);
        }}
        return dp[n];
    }
    
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna