class Solution {
    public int countMinReversals(String s) {
        // code here
        if(s.length() %2 !=0) return -1;
        
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if( ch=='{') stack.push(ch);
            else{
                if(stack.isEmpty() || stack.peek()=='}'){
                    stack.push(ch);
                }
                else{
                    stack.pop();
                }
            }
            
        }
        int ans=-0;  int open =0; int close =0;
        while(!stack.isEmpty()){
            char top= stack.pop();
            if(top=='{') open ++;
            else close ++;
            
        }
        ans=(int) (Math.ceil(open /2.0)+Math.ceil(close/2.0));
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna