

class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";

        String s =countAndSay(n-1); 
        String ans ="";
        int i =0;
        int j=0;
        while (j != s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            else {
                int freq= j-i;
                ans+=freq;
                ans+=s.charAt(i);
                i=j;
            }
        }
        int freq= j-i;
                ans+=freq;
                ans+=s.charAt(i);
        //for  last case


        return ans;
    }
}
// // Handle the last group
// int freq = j - i;
// ans += freq;
// ans += s.charAt(i);
// Why is it needed?

// Inside the loop, you only add a group when you find a different character.

// if(s.charAt(i) == s.charAt(j))
//     j++;
// else {
//     // Add previous group
// }

// But for the last group, there is no next different character to trigger the else block.

// So after the loop finishes, the last group is still waiting to be added.

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna