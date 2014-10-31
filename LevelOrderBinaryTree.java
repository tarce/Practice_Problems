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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        
        ArrayList<ArrayList<Integer>> levelOrderList = new ArrayList<ArrayList<Integer>>();
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        if (root == null) {
            return levelOrderList;
        }
        
        q.add(root);
        
        while (!q.isEmpty()) {
            
            ArrayList<Integer> curLevel = new ArrayList<Integer>();
            Queue<TreeNode> tempQ = new LinkedList<TreeNode>();
            
            while (!q.isEmpty()) {
                
                TreeNode curNode = q.poll();
                curLevel.add(curNode.val);
                
                if (curNode.left != null) {
                    tempQ.offer(curNode.left);
                }
                if (curNode.right != null) {
                    tempQ.offer(curNode.right);
                }
                
            }
            
            levelOrderList.add(curLevel);
            q.addAll(tempQ);
        }
        
        return levelOrderList;
        
    }
}
