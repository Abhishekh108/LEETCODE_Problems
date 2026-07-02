class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate(n,0,0,"",ans);
        return ans;
    }
    public void generate(int n, int l, int r, String s,List<String> ans){
        //base case
        if( r==n){
            ans.add(s);
            return;
        }
        if(l<n) generate(n,l+1,r,s+"(", ans);
        if(r<l) generate(n,l,r+1,s+")",ans);
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna