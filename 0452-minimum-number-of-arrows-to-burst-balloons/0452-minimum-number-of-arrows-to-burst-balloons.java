class Solution {
    public int findMinArrowShots(int[][] points) {
        //minimum no. of arrow to shoot all the
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arrow=0;
        int lastend=points[0][1];

        for(int i=1; i<points.length;i++){
            //[1,2],[2,3]
            //   l    i
            if(points[i][0]<=lastend){
                arrow++;
            }else
            { //[1,5] [6,9] last=9 points[i][0]<last 
            //update the last
                lastend= points[i][1];
            }

        }
        return points.length-arrow;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna