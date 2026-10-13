class Solution {
    public int diagonalSum(int[][] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            // for(int j=0;j<arr[0].length;j++){
            //     if(i==j){
            //         sum=sum+arr[i][j];
            //     }
            //     else if(i+j==arr.length-1){
            //         sum=sum+arr[i][j];
            //     }
            // }
            int a=i; int b=n-i-1;
            if(a==b){
                sum+=arr[i][a];
                continue;
            }
            sum=sum+arr[i][a]+arr[i][b];
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna