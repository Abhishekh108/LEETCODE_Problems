class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        int n=arr.length; // bcz in while we are using <n and n is less then size of arr
        while(i<n){
            if(arr[i]==i || arr[i]==n){
                i++;
            }
            else{
                //[3,0,4,1]
                // 0 1 2 3
                int idx= arr[i];
                swap(arr,i,idx);
            }
        }
        for(i=0;i<n;i++){
            //[3,0,4,1]
            // 0 1 2 3
            // 0 1 4 3 swapped
            if(arr[i] != i) return i;
        }
    return n;
         
    }
    private void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
    
    // this is mistake bcz we have to change the element in arr so we have to pas arr also

    // private void swap(int arr[i],int arr[idx]){
    //     int temp= arr[i];
    //     arr[i]= arr[idx];
    //     arr[idx]=temp;
    // }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna