class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        
        int ans=0;
        int count=0;
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            if(ch=='(') count++;
            ans= Math.max(count,ans);
            if(ch==')'){
                 count--;
            }
            
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna