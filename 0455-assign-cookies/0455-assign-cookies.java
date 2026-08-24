class Solution {
    public int findContentChildren(int[] greed, int[] size) {
        Arrays.sort(greed);// greed of each children
        Arrays.sort(size); // size of the cookes

        int left= 0; //greed of child
        int right=0; // size of cookies
        while(left < greed.length && right < size.length){
            if(greed[left]<=size[right]){
                left++;
                right++;
            }
            else{//(greed[left]>size[rigght]){
                right++;
            }

        }
        return left;
    }
}
    
// Sort greed ↑ ascending
// Sort cookies ↑
//         ↓
// Take smallest cookie
//         ↓
// If it satisfies smallest remaining child → assign
// Otherwise → discard cookie
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna