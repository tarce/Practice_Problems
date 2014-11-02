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
    public boolean isSymmetric(TreeNode root) {
        
        Queue<TreeNode> stack = new LinkedList<TreeNode>();
        
        if (root == null) {
            return true;
        }
        
        stack.offer(root.left);
        stack.offer(root.right);

        while (!(stack.size() == 0)) {
            
            TreeNode left = stack.poll();
            TreeNode right = stack.poll();
            
            if (left == null || right == null) {
                if (left == null && right == null) {
                    continue;
                }
                return false;
            }
            
            if (left.val != right.val) {
                return false;
            }
            
            stack.offer(left.left);
            stack.offer(right.right);
            stack.offer(left.right);
            stack.offer(right.left);
        }
        
        return true;
    }
}
