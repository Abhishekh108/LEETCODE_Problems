class Solution {
    void dfs(int[][] image, int i, int j, int oldcolor, int color) {
        if(i<0 || j<0 || i>=image.length || j>=image[0].length) return; 
        if(image[i][j] != oldcolor) return ;
        image[i][j]=color;
        dfs(image,i+1,j,oldcolor,color);
        dfs(image,i-1,j,oldcolor,color);
        dfs(image,i,j+1,oldcolor,color);
        dfs(image,i,j-1,oldcolor,color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor=image[sr][sc];
        if(oldcolor==color) return image;

        dfs(image,sr,sc,oldcolor,color);
        return image;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna