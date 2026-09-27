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
    public int maxDepth(TreeNode root) {
        // if(root==null) return 0;
        // int lh=maxDepth(root.left);
        // int rh=maxDepth(root.right);
        // return 1+Math.max(lh,rh);  
        
        // level-order
        if(root==null) return 0;
        Queue<TreeNode> qu=new LinkedList<>();
        int max=0;
        qu.add(root);
        int c=0;
        while(!qu.isEmpty()){
            int lev=qu.size();
            c++;
            for(int i=0;i<lev;i++){
                TreeNode n=qu.remove();
                if(n.left!=null) qu.add(n.left);
                if(n.right!=null) qu.add(n.right);
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna