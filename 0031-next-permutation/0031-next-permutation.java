class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int g_idx=-1;
        for(int i=n-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                g_idx=i-1 ;
                break;
            }
            
        }
        if(g_idx !=-1){
            int s_idx=g_idx;
            for(int j=n-1;j>g_idx;j--){
                if(arr[j]>arr[g_idx]){
                    s_idx=j;
                    break;
                } 

            }
            //swap g_idx , s_idx
            arr[g_idx]=arr[g_idx]^arr[s_idx];
            arr[s_idx]=arr[g_idx]^arr[s_idx];
            arr[g_idx]=arr[g_idx]^arr[s_idx];

            //reverse the number between
            //  g_idx, n-1
            reverse(arr,g_idx+1,n-1); 

        }
        else{
            reverse(arr,0,n-1);
        }
        
        
    }
    public void reverse(int arr[],int i,int j){
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna