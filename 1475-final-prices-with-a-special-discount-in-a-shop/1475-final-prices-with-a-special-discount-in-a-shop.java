class Solution {
    public int[] finalPrices(int[] arr) {
        Stack<Integer> stack= new Stack<>();
        int n=arr.length;
        int ans[]= new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[i]< stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=arr[i];
                stack.push(arr[i]);
            }
            else{
                ans[i]=arr[i]-stack.peek();
                stack.push(arr[i]);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna