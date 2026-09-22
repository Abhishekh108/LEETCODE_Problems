class Solution {
    public int removeDuplicates(int[] arr) {
        // int i=1;
        // int j=0;
        
        // while(i<arr.length){
        //     while(i<arr.length && arr[i]==arr[j]){
        //         i++;
        //     }
        //     //swap arr[j+1] arr[i]
        //     int temp= arr[j+1];
        //     arr[j+1]=arr[i];
        //     arr[i]=temp;
        //     i++;
        //     j++;
        // }
        // return j+1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[count] !=arr[i]){
                count++;
                arr[count]=arr[i];
            }
        }
        return count+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna