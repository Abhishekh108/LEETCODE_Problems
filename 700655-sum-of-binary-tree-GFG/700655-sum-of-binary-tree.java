/* Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
} */

class Solution {
    static int sumBT(Node root) {
        // code here
        if(root==null) return 0;
        return root.data+sumBT(root.left)+sumBT(root.right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna