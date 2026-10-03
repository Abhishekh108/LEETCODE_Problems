class Solution {
    public int minAddToMakeValid(String s) {
       int count=0;
       int ans=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='(') count ++;
            else{ // ')'
                if(count>0) count--;
                else{
                    ans++;
                }
            }
            
            
        }
        return ans+count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna