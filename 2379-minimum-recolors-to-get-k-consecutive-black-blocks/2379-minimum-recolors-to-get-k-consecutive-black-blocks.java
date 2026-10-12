class Solution {
    public int minimumRecolors(String s, int k) {
        int n=s.length();
        int B=0;
        int W=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='W'){
                W++;
            }
            else{
                B++;
            }
        }
        ans=Math.min(ans,W);
        int j=0;
        for(int i=k;i<n;i++){
            if(s.charAt(j)=='W'){
                W--;
            }
            if(s.charAt(i)=='W'){
                W++;
            }
            ans=Math.min(ans,W);
            j++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna