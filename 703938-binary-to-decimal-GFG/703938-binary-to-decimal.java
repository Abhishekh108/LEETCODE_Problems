class Solution {
    public int binaryToDecimal(String s) {
        // code here
        int ans=0;
        int n=s.length();
        int pow=1;
        for(int i=n-1 ;i>=0;i--){
            char ch= s.charAt(i);
            int digit=ch-'0';
            ans += digit*pow;
            pow=pow*2;
            
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna