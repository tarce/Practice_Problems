/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (treeHeight(root) == -1) {
            return false;
        }
        return true;
    }
    
    public int treeHeight (TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int lh = treeHeight(root.left);
        if (lh == -1) {
            return -1;
        }
        
        int rh = treeHeight(root.right);
        if (rh == -1) {
            return -1;
        }
        
        if (Math.abs(lh - rh) > 1) {
            return -1;
        }
        
        return (lh > rh) ? (lh + 1) : (rh + 1); 
    }
}
