class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        for(int i=0;i<31;i++){
            // start=start>>i;
            // goal=goal>>i;wrong
            if((start>>i) % 2 != (goal>>i)%2) count ++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna