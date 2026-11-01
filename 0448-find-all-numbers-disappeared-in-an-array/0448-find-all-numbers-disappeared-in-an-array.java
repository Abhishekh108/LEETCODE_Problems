class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer>ans= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            // indexing start at 0 to n-1
            // index of 1-0 2-1 
           int idx=Math.abs(arr[i])-1;
           if(arr[idx]>0){//then make negative
               arr[idx]= arr[idx]*-1;
           }
        } //-4 -3 -2 -7 8 2 -3 -1 
          // 0  1  2  3 4 5
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna