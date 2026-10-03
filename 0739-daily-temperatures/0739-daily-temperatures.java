class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> stack= new Stack<>();
        int n= arr.length;
        
        int ans[]= new int[n];
        for(int i=n-1;i>=0;i--){
            // if(stack.isEmpty()){
            //     stack.push(i);
            //     ans[i]=stack.peek()-i;
            // }
            // else{
            //     //count=0;
            //     if(arr[stack.peek()]>arr[i]){
            //         ans[i]=stack.peek()-i;
            //         stack.push(i);
            //     }
            //     else{
            //         while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
            //             stack.pop();
            //         }
            //         if(stack.isEmpty()){
            //             ans[i]=0;
            //             stack.push(i);
            //         }
            //         else{
            //             ans[i]=stack.peek()-i;
            //             stack.push(i);
            //         }
            //     }
            // }
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=0;
                stack.push(i);
            }
            else{
                ans[i]=stack.peek()-i;
                stack.push(i);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna