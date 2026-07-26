/*Complete the function below
Node is as follows:
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};
*/
class Solution {
    public boolean isFullTree(Node root) {
        // code here
        if(root== null)return true;
        //leaf node
        if(root.left==null && root.right==null){
            return true;
        }
        if(root.left !=null && root.right !=null){
            return isFullTree( root.left) &&isFullTree(root.right);
        }
        // for only one children
        return false;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna