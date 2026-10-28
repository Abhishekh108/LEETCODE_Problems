class Solution {
    public int divide(int dividend, int divi) {
        if (dividend == Integer.MIN_VALUE && divi == -1) {
            return Integer.MAX_VALUE;
        }
         long ans=0;
         int sign= 1;
         if(dividend<0) sign -=1; //if  one true  0
         if(divi<0) sign -=1;    //  if both true -1 

         long number= Math.abs((long) dividend);
         long divisor= Math.abs((long) divi);

        
        while(number>=divisor){
            int count=0;

            while(number>=divisor<<(count+1)){ //divisor<<(count+1) = divisor*2^ n
                count++;
            }
            ans+=(1<<count); //  ans+=2^count
            number= number-(divisor<<count);
        }

        if(sign==0) return -(int)ans;
        return (int)ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna