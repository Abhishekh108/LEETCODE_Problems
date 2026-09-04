/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // after the bad version all other are bad
        //  1 2 3 4 5 6 7
        //  L   M   b   H


        int low=0;
        int high=n;
        boolean flag;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            flag=isBadVersion(mid);
            if(flag==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna