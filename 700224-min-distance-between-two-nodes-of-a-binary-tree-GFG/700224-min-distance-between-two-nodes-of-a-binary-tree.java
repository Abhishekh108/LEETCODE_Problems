/* A binary tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int findDist(Node root, int a, int b) {
    
        // code here
        Node LCA=lca(root,a,b);
        int dis[]= {0,0};
        dfs(LCA,a,b,0,dis);
        return dis[0]+dis[1];
    }
    public void dfs(Node LCA,int a,int b, int level, int[] dis){
        if(LCA==null) return;
        if(LCA.data==a) dis[0]=level;
        if(LCA.data==b) dis[1]=level;
        dfs(LCA.left,a,b,level+1,dis);
        dfs(LCA.right,a,b,level+1,dis);
        
    }
    public Node lca(Node root,int p, int q){
            if(root==null) return null;
            
            if(root.data==p || root.data==q){
                return root;
            }
            //Node 
            Node left= lca(root.left, p, q);
            Node right = lca(root.right,p,q);
            
            if( left !=null && right !=null) return root;
            
            if(left!= null) return left;
             return right;
        }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna