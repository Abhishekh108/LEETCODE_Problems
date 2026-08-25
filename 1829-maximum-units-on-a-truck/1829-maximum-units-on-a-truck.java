class Solution {
    public int maximumUnits(int[][] boxtype, int trucksize) {
        Arrays.sort(boxtype,(a,b)->Integer.compare(b[1],a[1]));
// a[1] = a box type के units per box
// b[1] = b box type के units per box
        int n=boxtype.length;
        int  total=0;
        for(int i=0;i<n;i++){
            if(boxtype[i][0]<=trucksize){
                total +=boxtype[i][0]*boxtype[i][1];
                trucksize -= boxtype[i][0];
            }
            else if(boxtype[i][0]>trucksize && trucksize > 0){
                total += trucksize *boxtype[i][1];
                trucksize=0;
                return total;
            }

        }
         return total;
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna