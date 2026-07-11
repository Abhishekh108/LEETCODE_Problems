class Solution {
    public int findPairs(int[] arr, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for( int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        System.out.println(map);
        int pairs=0;
        for( int ele: map.keySet()){
            //ele-k= rem;
            int rem = ele-k;
             if (k == 0) {
                if (map.get(ele) >= 2) {
                    pairs++;
                }
             }
            else{
                //  if(map.containsKey(rem)){
                    // But the question asks for unique pairs, not the number of ways to form pairs.
                    //  pairs +=Math.min(map.get(ele),map.get(rem));

                    if (map.containsKey(rem)) {
                        pairs++;
                 }
            }
        }     
        return pairs;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna