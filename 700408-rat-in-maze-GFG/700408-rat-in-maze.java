class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int er=maze.length-1;
        int ec=maze[0].length-1;
        boolean visited[][]= new boolean[maze.length][maze.length];
        ArrayList<String>ans= new ArrayList<>();
        solve(0,0,er,ec,visited,maze,"" ,ans);
        Collections.sort(ans);
        return ans;

    }
    public void solve(int r, int c,int er, int ec,boolean visited[][],int maze[][],String temp,ArrayList<String>ans){

        //base for invalid 
        //1= rat can move
        //0= rat cannot move
        if(r>er || c>ec || r<0 || c<0 || visited[r][c] || maze[r][c]==0){
            //if visited == true 
            return ;
        }
       visited[r][c]=true;
       
       //base
       if(r==er && c==ec){
           visited[r][c]=false;
           ans.add(temp);
           return ;
           
       }
        solve(r,c-1,er,ec,visited,maze,temp+'L',ans);
        solve(r,c+1,er,ec,visited,maze,temp+'R',ans);
        solve(r-1,c,er,ec,visited,maze,temp+'U',ans);
        solve(r+1,c,er,ec,visited,maze,temp+'D',ans);
        
        visited[r][c]= false;
        


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna