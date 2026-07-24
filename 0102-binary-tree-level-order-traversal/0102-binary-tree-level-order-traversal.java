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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
         if(root == null )return ans;
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);

        while( !q.isEmpty()){
            List<Integer> level = new ArrayList<>(); //forming a new list  to add the answer
            int siz = q.size(); // this is used for purpose 
            for( int i=0; i<siz;i++){
               TreeNode temp =q.remove();
               level.add(temp.val);

               if(temp.left != null){
                 q.add(temp.left);
               }
               if(temp.right !=  null){
                q.add(temp.right);
               }
            }
            ans.add(level);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna