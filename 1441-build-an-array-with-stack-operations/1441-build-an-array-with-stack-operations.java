class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<String> stack= new Stack<>();
        int m=target.length;
        int i=0;
        int j=1;
        while(i<target.length){
            if(j==target[i]){
                stack.push("Push");
                i++;
                j++;
            }
            else{
                stack.push("Push");
                stack.push("Pop");
                j++;
            }
        
        }
        return stack;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna