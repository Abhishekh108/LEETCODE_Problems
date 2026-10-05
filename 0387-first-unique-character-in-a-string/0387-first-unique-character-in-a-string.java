class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            boolean flag=false;
            for(int j=0;j<s.length();j++){
                if(i==j) continue;
               if( s.charAt(i)==s.charAt(j)){
                flag=true;
                break;
               }
            }
            if(flag==false) return i;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna