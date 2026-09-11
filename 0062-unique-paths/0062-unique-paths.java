class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return path(0,0,m,n,dp);
    }
    private int path(int row, int col, int m , int n, int dp[][]){ //if we do here Integer then it will go pass by reference
        if(row>=m || col>= n) return 0;
        if(row== m-1 && col == n-1) return 1;
        if(dp[row][col] !=-1) return dp[row][col];
        int right=path(row,col+1,m,n,dp);
        int down= path(row+1,col,m,n,dp);
        return dp[row][col]=right+down;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna