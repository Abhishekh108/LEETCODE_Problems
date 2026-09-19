class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n%2 !=0) return false; //odd

        Stack<Character> stack= new Stack<>();

        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            if(ch=='(' ||ch=='{'|| ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                else if(ch==')' && stack.peek() !='(') return false;
                else if(ch=='}' && stack.peek() !='{') return false;
                else if(ch==']' && stack.peek() !='[') return false;
                else stack.pop();
            }
                
        }
        return stack.isEmpty();

        
        // while(s.contains("()") ||s.contains("{}") ||s.contains("[]")){
        //     s=s.replace("()","");
        //     s=s.replace("{}","");
        //     s=s.replace("[]","");

        // }
        
        
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna