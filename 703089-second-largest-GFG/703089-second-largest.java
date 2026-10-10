class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = -1;
        int secondMax = -1;
        
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i]!=max)
            {
                secondMax = arr[i];
            }
        }
      
      return secondMax;  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna