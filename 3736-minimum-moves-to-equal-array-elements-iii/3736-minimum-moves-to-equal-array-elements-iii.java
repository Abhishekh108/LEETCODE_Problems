class Solution {
    public int minMoves(int[] arr) {
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        int count =0;
        for(int i=0;i<arr.length;i++){
            count += Math.abs(arr[i]-max);
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna