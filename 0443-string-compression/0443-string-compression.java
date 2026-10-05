class Solution {
    public int compress(char[] arr) {  //string is low in performace so we take  string buildee
        StringBuilder ans = new StringBuilder("");
        int i=0; int j=0;
        while(j<arr.length){
            if (arr[j]==arr[i]) {
                 j++;
            }
            else{
                ans.append(arr[i]);
                int len = j-i;
                if(len>1) ans.append(len);  //a.12
                i=j;
            }
        }
        //doing for the last bcz  j comes out
        ans.append(arr[i]);
        int len =j-i;
        if(len>1) ans.append(len);
        for( i=0; i<ans.length() ;i++){
            arr[i]=ans.charAt(i);
        }
        return ans.length();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna