class Solution {
    public int countGoodSubstrings(String s) {
        int n= s.length();
        int count =0;
        
        for(int i=0;i<=n-3;i++){
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i) !=s.charAt(i+2)){
                count++;
            }
        }
       return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna