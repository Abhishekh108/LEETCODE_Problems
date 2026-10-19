class Solution {
    public int solve(int i, int[]nums,int target){
        int n=nums.length;
        if(i==n){
            if(target==0) return 1;
            else return 0;
        }
        int add=solve(i+1,nums,target+nums[i]);
        int sum=solve(i+1,nums,target-nums[i]);
        return add+sum;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return solve(0,nums,target);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna