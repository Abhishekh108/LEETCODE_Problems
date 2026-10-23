class Solution {
    public int matrixScore(int[][] arr) {
        int m= arr.length;
        int n= arr[0].length;
        for(int i=0;i<m;i++){
           if(arr[i][0]==0){ //flip that row
            for(int j=0;j<n;j++){
                arr[i][j]=1-arr[i][j];
            }
           }
        }
        //travel column wise
        for(int j=0;j<n;j++){
            int zero=0;
            int one=0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0) zero++;
                else one++;
            }
            if(zero>one){
                for(int i=0;i<m;i++){
                arr[i][j]=1-arr[i][j];
            }
            }

        }
        int sum=0;
        int pow=1;
        for( int j=n-1;j>=0;j--){
            int ones=0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==1) ones++;
            }
            sum +=pow*ones;
            pow=pow*2;
        }
        return sum;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna