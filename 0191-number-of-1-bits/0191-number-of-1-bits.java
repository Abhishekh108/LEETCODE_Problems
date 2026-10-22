class Solution {
    public int hammingWeight(int n) {
        int count =0;
        // for(int i=0;i<31;i++){
        //     if((n>>i)%2 !=0)count ++;
        // }
        // return count;
        
        // count the no. of differnet bits by and
        // take and this removes the odd 1;
        while(n!=0){
            n=n & n-1;
            count++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna