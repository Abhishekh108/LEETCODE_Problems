class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> al= new ArrayList<>();
        int left=0;
        int right=arr[0].length-1;
        int top=0;
        int buttom=arr.length-1;

        while(top<=buttom &&left<=right){
            //top
            for(int i=left;i<=right;i++){
                al.add(arr[top][i]);
            }
            top++;
            //right
            for(int i=top;i<=buttom;i++){
                al.add(arr[i][right]);
            }
            right--;
            //buttom
            if(top<=buttom){
            for(int i=right;i>=left;i--){
                al.add(arr[buttom][i]);
            }
            buttom--;
            }

            //left
            if(left<=right){
            for(int i=buttom;i>=top;i--){
                al.add(arr[i][left]);
            }
            left++;
            }
        }
        return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna