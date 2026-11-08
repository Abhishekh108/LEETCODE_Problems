class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0) && findh(board,i,j,0,word)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean findh(char[][]board, int i, int j, int idx, String word){

        //base case
        if(idx>=word.length()){
            return true;
        }
        if(i<0 || i>=board.length ||j<0 ||j>=board[0].length || board[i][j] !=word.charAt(idx)){
            return false;
        }//equals hai tab ye
        // explore
       char temp= board[i][j];
       board[i][j]='$';
       //explore
       boolean ans=findh(board,i+1,j,idx+1,word) ||
       findh(board,i-1,j,idx+1,word) ||
       findh(board,i,j-1,idx+1,word) ||
       findh(board,i,j+1,idx+1,word) ;
       board[i][j]=temp;
       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna