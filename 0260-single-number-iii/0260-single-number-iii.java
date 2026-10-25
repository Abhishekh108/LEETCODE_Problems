class Solution {
    public int[] singleNumber(int[] arr) {
        int zor=arr[0];
        for(int i=1;i<arr.length;i++){
            zor=zor^arr[i];
        }
        // zor gives 6  110  unique 3 = 011 5= 101 first 
        // find the first bit thar is difference;
        int pos= zor &(- zor);   //right most bit set and other all are zeros

        // divide the element into 2 parts
        int a=0;
        int b=0;
        for(int ele: arr){
            if((ele & pos)==0){
                a=a^ele;
            }
            else{
                b=b^ele;
            }
        }
        return new int[]{a,b};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna