class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        int n= s.length();
        if(n% 2!=0) return false;
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{ // } ) ]
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    if(ch==')' && stack.peek() !='(') return false;
                    if(ch=='}' && stack.peek() !='{') return false;
                    if(ch==']' && stack.peek() !='[') return false;
                    //ootherwise valid then
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