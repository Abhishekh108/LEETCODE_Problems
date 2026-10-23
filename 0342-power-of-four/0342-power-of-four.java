class Solution {
    public boolean isPowerOfFour(int n) {
        if(Math.sqrt(n)*Math.sqrt(n)!=n)return false;
        if(n==1) return true;
        if(n<4) return false;
        return ((n & n-1)==0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna