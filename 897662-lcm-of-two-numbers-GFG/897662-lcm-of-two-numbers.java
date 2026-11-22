class Solution {
    public int lcm(int a, int b) {
        // code here
        //lcm = a*b/hcf
       int hcf= hcf(a,b);
       int lcm= (a*b)/hcf;
       return lcm;
    }
    public int hcf(int a , int b){
        if(b==0) return a;
        return hcf(b,a%b);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna