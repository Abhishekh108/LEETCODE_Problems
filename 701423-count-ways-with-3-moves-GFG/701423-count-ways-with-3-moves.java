class Solution {

    static int countWays(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        if(n==0) return 1;
        if(n<0)  return 0;
        return countWays(n-1)+countWays(n-2)+countWays(n-3);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna