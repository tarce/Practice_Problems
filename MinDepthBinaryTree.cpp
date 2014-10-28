/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along 
 * the shortest path from the root node down to 
 * the nearest leaf node.
 */

/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int minDepth(TreeNode *root) {
        if (root == NULL) {
            return 0;
        }
        
        if ((root->left == NULL) && (root->right == NULL)) {
            return 1;
        }
        
        if (root->left == NULL) {
            return 1 + minDepth(root->right);
        }
        
        if (root->right == NULL) {
            return 1 + minDepth(root->left);
        }
        
        int left = minDepth(root->left);
        int right = minDepth(root->right);
        return (left > right) ? (right + 1) : (left + 1);

    }
};
