class Solution {
    boolean f = false;
     void find(int i , int j , int mat1[][], int mat2[][]){
        if(i<0 || j<0 || i>= mat1.length || j>= mat1[0].length) 
        return;
        if(mat2[i][j] == 1 && mat1[i][j]==0) { f = true;}
        if(mat2[i][j] == 0) return;
        mat2[i][j]=0;
        mat1[i][j] = 0;
        find(i+1,j,mat1,mat2);
        find(i-1,j,mat1,mat2);
        find(i,j+1,mat1,mat2);
        find(i,j-1,mat1,mat2);
     }
    public int countSubIslands(int[][] mat1, int[][] mat2) {
        int ans = 0;
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                if(mat2[i][j] == 1){
                        System.out.println(i+ "   "+ j);
                    find(i,j,mat1,mat2);
                    if(!f) {
                        System.out.println("ans"+i+ "   "+ j);
                        ans++;
                    }
                        f = false;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna