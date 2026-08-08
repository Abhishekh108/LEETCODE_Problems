class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='(') stack.push(ch); //blind insertion
          else{
            if(stack.isEmpty() || stack.peek()==')'){
                stack.push(ch);
            }
            else{
                //stack is not emp & top={
                stack.pop();
            }
          }
           
        }
        return stack.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna