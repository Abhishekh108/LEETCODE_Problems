class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n%2 !=0) return false; //odd
        
        while(s.contains("()") ||s.contains("{}") ||s.contains("[]")){
            s=s.replace("()","");
            s=s.replace("{}","");
            s=s.replace("[]","");

        }
        return s.isEmpty();
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna