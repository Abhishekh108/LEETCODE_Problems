class Solution {
    int single(int[] arr) {
        // code here
        int ans= arr[0];
        for(int i=1;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna