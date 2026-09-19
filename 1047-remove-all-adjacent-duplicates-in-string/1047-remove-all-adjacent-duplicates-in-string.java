class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack= new Stack<>();
        stack.push(s.charAt(0));
        String ans="";
        for(int i=1;i<s.length();i++){
            char ch= s.charAt(i);
            if(!stack.isEmpty() && ch==stack.peek()){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            ans=stack.pop()+ans;
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna