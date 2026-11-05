class Solution {
    boolean ans= false;
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0))
                find(i,j,0,word,board);
                if(ans==true) return true;
            }
        }
        return false;
    }
    public void find(int i, int j,int idx,String target,char[][]mat){
        if(idx>=target.length()){
            ans=true;
            return ;
        }
        if(i<0 || j<0 || i>=mat.length ||j>=mat[0].length) return ;
        if(ans==true) return;
        if(mat[i][j] !=target.charAt(idx)) return ;

        char temp=mat[i][j];
        mat[i][j]= '*';
        
        find(i+1,j,idx+1,target,mat);
        find(i-1,j,idx+1,target,mat);
        find(i,j+1,idx+1,target,mat);
        find(i,j-1,idx+1,target,mat);
        mat[i][j]=temp;
         

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna