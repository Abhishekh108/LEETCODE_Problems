class Solution {
    public int missingNumber(int[] arr) {
        int i=0; //
        int n=arr.length;
        while(i<n){
            // 0 to N element  (but 1 is missing)
            // so if arr[i]= i or n go forward
            // 0 1 2 6 4 5 n=6 (0-6) 3 is missing
            if(arr[i]==i || arr[i]==n){
                i++;
            }
            else{
                //6 5 2 0 4 1
                //  i       5
                //swap(arr[i],arr[arr[i]])
                int temp=arr[i];
                 arr[i]=arr[temp];
                arr[temp]=temp;

            }
        }
        for( int ele:arr){
            System.out.println(ele);
        }
        for(i=0;i<arr.length;i++){
            if(arr[i] != i){
                return i;
            }
        }
        return n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna