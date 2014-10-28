/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined 
 * as a binary tree in which the depth of the two subtrees 
 * of every node never differ by more than 1.
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

    bool isBalanced(TreeNode *root) {
        if (treeHeight(root) == -1) {
            return false;
        }
        return true;
    }
    
    int treeHeight (TreeNode *root) {
        if (root == NULL) {
            return 0;
        }
        
        int lh = treeHeight(root->left);
        if (lh == -1) {
            return -1;
        }
        
        int rh = treeHeight(root->right);
        if (rh == -1) {
            return -1;
        }
        
        if (abs(lh - rh) > 1) {
            return -1;
        }
        
        return (lh > rh) ? (lh + 1) : (rh + 1); 
    }
};
