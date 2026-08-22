class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n= intervals.length;
       Arrays.sort(intervals,(a,b)->a[1]-b[1]);//nlogn

       int remove=0;
       int last=intervals[0][1];

       for(int i=1; i<intervals.length;i++){
            //[1,6] [5,9]
            //   0   i
            if(last > intervals[i][0]){
                remove++;
            }
            else{
                //last<= star[i]=6 
                //[1,6] [6,8] // last=8
                last=intervals[i][1];
            }
       }
       return remove;



    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna