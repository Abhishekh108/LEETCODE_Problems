class Solution {
    public int minPathSum(int[][] arr) {
        int m= arr.length;
        int n= arr[0].length;
       // int [][]dp= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                     arr[i][j]=arr[i][j];
                }
                else if(i==0) arr[i][j]=arr[i][j]+arr[i][j-1];
                else if(j==0) arr[i][j]= arr[i][j]+arr[i-1][j];
                else{
                    arr[i][j]=arr[i][j]+Math.min(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        return arr[m-1][n-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna