class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        //s = "abc", t = "ahbgdc"
        //     i          j
        while(i<s.length() && j< t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        System.out.print(i);
        if(i==s.length()){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna