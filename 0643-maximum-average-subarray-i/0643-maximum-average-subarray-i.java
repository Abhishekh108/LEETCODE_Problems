class Solution {
    public double findMaxAverage(int[] arr, int k) {
        
        double sum=0;
        double avg=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        avg=sum/k;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i];
            sum=sum-arr[i-k];
            avg=Math.max(avg,(double)(sum/k));
        }
        return avg;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna