/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null) return false;
        Queue<TreeNode> q= new LinkedList<>();
        int level=-1;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            level++ ;
            ArrayList<Integer> arr= new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr= q.poll();
                arr.add(curr.val);
                if(level %2==0){
                    if(curr.val %2 ==0) return false;
                    if(arr.size()>1){ //odd and increasing
                        if(arr.get(i)<=arr.get(i-1)) return false;
                    }
                }
                else{
                    if(curr.val%2 !=0) return false;
                    if(arr.size()>1){ //even and decreasing
                        if(arr.get(i)>=arr.get(i-1)) return false;
                    }
                }
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);

            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna