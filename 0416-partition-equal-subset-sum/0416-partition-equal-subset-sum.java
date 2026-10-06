class Solution {
    public boolean partition(int i,int target,int []arr,Boolean dp[][]){
            if(i==arr.length){
                if(target==0)return true;
                else return false;
            }
            if(target==0) return true;

            if(dp[i][target] != null){
                return dp[i][target];
            }
            //not already calculated
            //skip

            boolean skip=partition(i+1,target,arr,dp);

            boolean take=false;
            //take only if num<=target
            if(arr[i]<=target){
                take=partition(i+1,target-arr[i],arr,dp);
            }
            return dp[i][target]= take|| skip;


        
    }
    public boolean canPartition(int[] arr) {
        int sum=0;
        for(int ele: arr) sum +=ele;

        if(sum %2 !=0) return false;
        int target=sum/2;
        Boolean dp[][]= new Boolean[arr.length][target+1];

        // for(int i=0;i<arr.lenght;i++){
        //     for(int j=0;j<=target;j++){
        //         dp[i][j]=-1;
        //     }
        // }
        
        return partition(0,target,arr,dp);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna