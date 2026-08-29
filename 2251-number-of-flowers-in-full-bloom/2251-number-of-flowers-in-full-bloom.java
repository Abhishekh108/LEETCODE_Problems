class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {

        int[] ans = new int[people.length];

        int start[]= new int [flowers.length];
        int end[]= new int [flowers.length];
        for(int i=0;i<flowers.length;i++){
            start[i]=flowers[i][0];
            end[i]=flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        
        
        for(int i=0;i<people.length;i++){
            int upperbond=upperbond(start,people[i]);
            int lowerbond=lowerbond(end,people[i]);
            ans[i]=upperbond-lowerbond;
        }
        


        // for (int i = 0; i < people.length; i++) {

        //     for (int j = 0; j < flowers.length; j++) {

        //         if (flowers[j][0] <= people[i] &&
        //             people[i] <= flowers[j][1]) {

        //             ans[i]++;
        //         }
        //     }
        // } //FRO THIS TIME LIMIT EXCEED

        return ans;
    }
    public int upperbond( int start[], int target){
        //[2 4 7 9] target=7 means go to 9 . just greater
        int upperbond=start.length; 
        int low=0;
        int high=start.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(start[mid]==target){
                low=mid+1;
            }
            else if(start[mid]>target){
                upperbond=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return upperbond;
    }
    public int lowerbond(int end[],int target){
        // lower bond = equal to or just greater then target
        int low=0;
        int high=end.length-1;
        int lowerbond=end.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(end[mid]==target){
                lowerbond=mid;
                high=mid-1;
            }
            else if(end[mid]>target){
                lowerbond=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return lowerbond;

    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna