class Solution {
    int er;
    int ec;
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        er=maze.length-1;
        ec=maze[0].length-1;
        ArrayList<String> ans = new ArrayList<>();
        
        if(maze[er][ec]==0) return ans;
        
        solve(maze,0,0,ans,"");
        return ans;
        
    }
    public void solve(int maze[][],int r, int c,ArrayList<String> ans,String temp){
        
        /// base
        if(r<0 || c<0 || r>er ||c>ec) return ;
        
        if(r==er && c==ec){
            ans.add(temp);
            return ;
        }
        
        if(maze[r][c]==0) return ;
        
        if(maze[r][c]==1){
            maze[r][c]=0;
            solve(maze, r+1,c,ans,temp+"D");
            solve(maze, r-1,c,ans,temp+"U");
            solve(maze, r,c+1,ans,temp+"R");
            solve(maze, r,c-1,ans,temp+"L");
            
            maze[r][c]=1;
            
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna