class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) return false;
       // System.out.println((n|n-1));
        return (n&n-1)==0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna