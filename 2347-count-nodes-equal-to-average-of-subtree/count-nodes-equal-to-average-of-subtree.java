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
    public void sum(TreeNode root,int[] sum){
        if(root==null) return;
        sum[0]+=root.val;
        sum[1]+=1;
        sum(root.left,sum);
        sum(root.right,sum);
    }
    public void cal(TreeNode root,int[] sum){
        if(root==null) return;
        sum(root,sum);
        int avg=sum[0]/sum[1];
        if(root.val==avg){
            sum[2]=sum[2]+1;
        }
        sum[0]=0;
        sum[1]=0;
        cal(root.left,sum);
         sum[0]=0;
        sum[1]=0;
        cal(root.right,sum);

    }
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        int[] sum=new int[3];
        cal(root,sum);
        return sum[2];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna