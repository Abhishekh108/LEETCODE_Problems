class Solution {
    public int fib(int n) {
        // if (n == 0) 
        //     return 0;
        // else if (n == 1) 
        //     return 1;
        // else
        //     return fib(n - 1) + fib(n - 2);

         if (n == 0) 
         return 0;
         else if (n == 1) return 1;
         
            int a=0;
            int b=1;
            for(int i=0;i<n;i++){   
                int c = a+b;
                a=b;
                b=c;
            }
            return a;
         

    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna