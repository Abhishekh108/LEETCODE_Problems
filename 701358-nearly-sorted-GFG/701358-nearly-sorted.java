class Solution {
    public void nearlySorted(int[] arr, int k) {
        int idx=0;
        // code here
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k){
                arr[idx++]=pq.remove();
            }
        }
        while(pq.size()>0){
            arr[idx++]=pq.remove();
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna