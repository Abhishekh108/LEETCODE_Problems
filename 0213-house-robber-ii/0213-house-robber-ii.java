class Solution {                        //0      n-2 leaving last ele
    public int maxamount(int arr[],int start,int end){

        int dp[]= new int[end-start+1];//excluding start or end
        Arrays.fill(dp,-1);
        dp[0]=arr[start];
        
        if(start==end) return dp[0];

        dp[1]=Math.max(dp[0],arr[start+1]);

        for(int i=2;i<dp.length;i++){
            //arr might be 1 2 3 ...to n-1
            // or          0 1 2 .....n-2
            //always use index start and end for arr
            dp[i]=Math.max(arr[start+i]+dp[i-2], dp[i-1]);
        }
        
        return dp[dp.length-1]; //end=
    }
    public int rob(int[] arr) {
        //we have to calculate for 2 cases  
        //1.take start
        //2. take end and them do maximum

        //i will do by tabulation method
        int n=arr.length;
        if(n==1) return arr[0];
        

        int including_start=maxamount(arr,0,arr.length-2);//excluding last
        int including_end=maxamount(arr,1,arr.length-1);
        return Math.max(including_start,including_end);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna