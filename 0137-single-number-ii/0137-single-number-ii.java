class Solution {
    public int singleNumber(int[] arr) {
        if(arr.length==1) return arr[0];
        Arrays.sort(arr);
        if(arr[0] !=arr[1]) return arr[0];
        if(arr[arr.length-1] !=arr[arr.length-2]) return arr[arr.length-1];
        for(int i=1;i<arr.length;i=i+3){
            if(arr[i] !=arr[i-1]) return arr[i-1];
        }

    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna