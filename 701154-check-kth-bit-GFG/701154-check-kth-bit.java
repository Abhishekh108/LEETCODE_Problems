class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        n= n>>k;
        return n%2==1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna