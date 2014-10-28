/*
 * Given a binary tree, check whether it is a mirror of 
 * itself (ie, symmetric around its center).
 */

/*
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }
    
    // recursive solution
    public boolean isMirror(TreeNode a, TreeNode b) {
        
        // case where both a and b are null
        if (a == null && b == null) {
            return true;
        }

        if (a == null) {
            // then b must be non-null
            return false;
        }
        if (b == null) {
            // then a must be non-null
            return false;
        }
        
        // Note: a better way to write the above:
        // if (a == null || b == null) {return a == null && b == null)

        // case where a and b are not null
        if (a.val == b.val &&
            isMirror(a.left, b.right) &&
            isMirror(a.right, b.left)) {
                return true;
        }
        
        return false;
    }
}
