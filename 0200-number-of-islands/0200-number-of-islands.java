class Solution {
    void find(char grid[][],int i, int j){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length) return;
        if(grid[i][j]=='0') return;
        grid[i][j]='0';
        find(grid,i+1,j);
        find(grid,i-1,j);
        find(grid,i,j+1);
        find(grid,i,j-1);
    }
    public int numIslands(char[][] grid) {
        int land=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    find(grid,i,j);
                    land++;
                }
            }
        }
        return land;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna