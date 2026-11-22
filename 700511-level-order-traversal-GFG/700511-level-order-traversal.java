/* Structure of Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        if(root==null) return ans;
        
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(! q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node temp= q.poll();
                ans.add(temp.data);
                if(temp.left !=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna