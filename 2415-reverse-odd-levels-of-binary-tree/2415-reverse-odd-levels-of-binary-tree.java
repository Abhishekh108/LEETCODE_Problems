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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int size= q.size();
            ArrayList<TreeNode> al =new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr= q.poll();
                al.add(curr);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            if(level % 2 !=0){
                int i=0; int j=al.size()-1;
                while(i<j){
                    int temp= al.get(i).val;
                    al.get(i).val=al.get(j).val;
                    al.get(j).val=temp;
                    i++;
                    j--;
                }
            }
            level++;
        }
        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna