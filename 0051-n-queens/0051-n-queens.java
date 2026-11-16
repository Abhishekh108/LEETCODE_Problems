class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solve(board,0);
        return ans;
    }
    public void solve( char[][]board, int row){

        if(row>=board.length){
            List<String> temp = new ArrayList<>();

        for(int i = 0; i < board.length; i++){
            temp.add(new String(board[i]));
        }
    
        ans.add(temp);
        return;
        }
        for(int col=0;col<board.length;col++){
            if(issafe(board,row, col)){
                board[row][col]='Q';
                solve(board, row+1);
                board[row][col]='.';
            }
        }
    }
    public boolean issafe(char[][]board,int row, int col){

        //checking vertical
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q' && Math.abs(row - i) == Math.abs(col - j))
                    return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna