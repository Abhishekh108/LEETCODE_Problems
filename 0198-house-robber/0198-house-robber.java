class Solution {
    public int minamount(int []arr,int i,int []dp){
        // as it start from i=0 so i>= n then over
        if(i>=arr.length)return 0;
        //just below the base case
        if(dp[i] !=-1) return dp[i];

        int take= arr[i]+ minamount(arr,i+2,dp);
        int skip= minamount(arr,i+1,dp);
        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
        //make dp array
        int dp[]= new int[nums.length];
        Arrays.fill(dp,-1);
        return minamount(nums,0,dp);
    }//nw the tabulation code
    // dp[i]= max(arr[i]+dp[i-2], dp[i-1]);
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna