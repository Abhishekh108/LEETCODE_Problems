class Solution {
    
    public int reverse( int a , int b){
        if(b==0) return 1;
        int call= reverse(a,b/2);
        if(b%2==0) return call*call;
        else  return a*call*call;
    
        }
    public int reverseExponentiation(int n) {
        // code here
        if(n==10) return 10;
        
        return reverse(n,n);
        
    }

}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna