class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    ArrayList<Integer>al= new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[j]);
                    al.add(arr[k]);
                    ans.add(al);
                    j++;
                    k--;
                    while(j<k && arr[k]==arr[k+1]){
                        k--;
                    }
                    while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna