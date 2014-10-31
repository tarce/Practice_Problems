/**
 * Given a binary tree, check whether it is a mirror 
 * of itself (ie, symmetric around its center).
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
    bool isSymmetric(TreeNode *root) {
        if (root == NULL) {
            return true;
        }
        
        if (isMirror(root->left, root->right)) {
            return true;
        }
        
        return false;
        
    }
    
    bool isMirror(TreeNode *a, TreeNode *b) {
        
        if (a == NULL || b == NULL) {
            return (a == NULL && b == NULL);
        }
        
        if (a->val == b->val &&
            isMirror(a->left, b->right) &&
            isMirror(a->right, b->left)) {
                return true;
            }
            
        return false;
    }
};
