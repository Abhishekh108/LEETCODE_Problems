class Solution {
    public int calPoints(String[] s) {
        int n= s.length;
        int ans=0;
      
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<n;i++){
            String ch=s[i];
            if(ch.equals("C")){
                stack.pop();
            }
            else if(ch.equals("D")){
                int num= stack.pop();
                stack.push(num);
                stack.push(num*2);
            }
            else if(ch.equals("+")){
                int n1=stack.pop();
                int n2= stack.pop();
                stack.push(n2);
                stack.push(n1);
                stack.push(n1+n2);
            }
            else{
                int n3=Integer.parseInt(ch);
            stack.push(n3);
            }
            
        }
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna