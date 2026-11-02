class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0) return null;
        int m =mat.length;
        int n=mat[0].length;
        int result[]= new int[m*n];
        int row=0; int col=0;
        int idx=0;
        boolean upward=true;

        while(idx < m*n){
            result[idx++]=mat[row][col];

            if(upward){
                if(col==n-1){//right boundary go down and swithch direction
                    row++;
                    upward=false;
                } 
                else if(row==0){
                    col++;
                    upward= false;
                }
                else{
                    //more element
                    row--;
                    col++;
                }
            }
            else{
                //downward
                if(row>=m-1){
                    //at bottom boundary go right and switch  direction
                    col++;
                    upward=true;
                }
                else if(col==0){
                    row++;
                    upward=true;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return result;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna