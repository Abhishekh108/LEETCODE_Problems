class Solution {
    public int maxamount(int []arr,int idx,int[]dp){
        if(idx>=arr.length) return 0;
        if(dp[idx] !=-1 ) return dp[idx];
        int take=arr[idx]+maxamount(arr,idx+2,dp);
        int skip=0+maxamount(arr,idx+1,dp); //as we have not taken so we can go idx+1;
        return dp[idx]=Math.max(take,skip);
    }
    public int rob(int[] arr) {
        int n=arr.length;
        int dp[]= new int[n];
        Arrays.fill(dp,-1);
        return maxamount(arr,0,dp);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna