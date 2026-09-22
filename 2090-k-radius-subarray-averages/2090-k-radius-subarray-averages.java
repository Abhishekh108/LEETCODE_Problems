class Solution {
    public int[] getAverages(int[] arr, int k) {
        int ans[]= new int[arr.length];
        int n=arr.length;
       long sum=0;
        //int max=;
         // If window size is bigger than array
        if (2 * k + 1 > n) {
            for (int i = 0; i < n; i++) {
                ans[i] = -1;
            }
            return ans;
        }
        if (k == 0) {
            for (int i = 0; i < n; i++) {
                ans[i] = arr[i];
            }
            return ans;
        }
       // k=k%n;
        for(int i=0;i<=(2*k);i++){
           sum=sum+arr[i];
           ans[i]=-1;  
        }
        // -[7,4,3,9,1,8,5,2,6]
        //   0 1 2 3
        ans[k]=(int)(sum/(2*k+1));
        for(int i=k+1;i<n-k;i++){
            sum=sum+arr[i+k];
            sum=sum-arr[i-k-1];
            ans[i]=(int)(sum/(2*k+1));    
        }
        for(int i=n-k;i<n;i++){
            ans[i]=-1;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna