class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        String ans="";
        int open=0;
        int close=0;
        int i=0;
        int j=0;
        while(i<n){
            char ch= s.charAt(i);
            if(ch=='('){
                open++;
                i++;
            }
            else if(ch==')'){
                close++;
                i++;
            }
            if(open==close){
                ans+=s.substring(j+1,i-1);
                open=0;
                close=0;
                //i++;
                j=i;
            }
        }
        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna