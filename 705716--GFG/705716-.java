class Solution {
    public void floydWarshall(int[][] dist) {
        // Code here
        for(int via=0;via<dist.length;via++){
            for(int i=0;i<dist.length;i++){
                for(int j=0;j<dist.length;j++){
                    if(dist[i][via] !=1e8 && dist[via][j]!=1e8 && dist[i][via] +dist[via][j]<dist[i][j]){
                       dist[i][j]= dist[i][via] +dist[via][j];
                    }
                    
                }
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna