class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 !=0) return false;

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch== '{' || ch=='[' ){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                char top =stack.peek();
                if(ch==')' && top != '(') return false;

                else if(ch=='}' && top != '{') return false;

                else if(ch==']' && top != '[') return false;

                else{
                    stack.pop();
                }
            }

             
        }
        return stack.isEmpty();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna