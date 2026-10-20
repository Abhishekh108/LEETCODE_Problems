class Solution {
     int sum=0;
    public int solve(int i, int[]nums,int target,int [][]dp){
        // if sum=5 target =3
        // 0 1 2 3 4 5 6 7 8 9 10 sum==3
        //-5 4 3 2 1 0 1 2 3 5 5
        //                t+s
        int n=nums.length;
        if(i==n){
            if(target==0) return 1;
            else return 0;
        }
        if (target > sum || target < -sum) {
            return 0;
        }
        if(dp[i][target+sum] != -1){
            return dp[i][target+sum];
        }
        int add=solve(i+1,nums,target+nums[i],dp);
        int sub=solve(i+1,nums,target-nums[i],dp);
        return dp[i][target+sum]=add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        for(int ele :nums){
            sum=sum+ele;
        }
        int dp[][]= new int[nums.length][2*sum+1];
        for(int[]rows :dp){
            Arrays.fill(rows,-1);
        }
        
        return solve(0,nums,target,dp);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna