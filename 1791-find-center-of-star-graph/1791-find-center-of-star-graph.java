class Solution {
    public int findCenter(int[][] edge) {
        int cen1=edge[0][0];
        int cen2=edge[0][1];
        if(cen1==edge[1][0] ||cen1==edge[1][1]) return cen1;
        return cen2;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna