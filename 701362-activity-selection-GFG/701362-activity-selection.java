class Solution {
    public int activitySelection(int[] start, int[] end) {
        // code here
        int n= start.length;
        Integer idx[]= new Integer[n];
        for(int i=0;i<n;i++){
            idx[i]=i;
        }
        Arrays.sort(idx,(a,b)-> end[a]-end[b]);
        //Integer idx[] = new Integer[n];

        // Arrays.sort(idx, (a,b) -> Integer.compare(end[a], end[b]));
        int maxactivity=1;
        
        int lastend=end[idx[0]];
        for(int i=1;i<n;i++){
           int index=idx[i];
            if(start[index]>lastend){
                maxactivity++;
                lastend=end[index];
            }
        }
        
        return maxactivity;
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna