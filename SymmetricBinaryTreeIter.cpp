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
        
        queue<TreeNode *> q;
        TreeNode *left = root->left;
        TreeNode *right = root->right;
        
        q.push(left);
        q.push(right);
        
        while (!q.empty()) {
            left = q.front();
            q.pop();
            right = q.front();
            q.pop();
            
            if (left == NULL || right == NULL) {
                if (left == NULL && right == NULL) {
                    continue;
                }
                return false;
            }
            
            if (left->val == right->val) {
                q.push(left->left);
                q.push(right->right);
                q.push(left->right);
                q.push(right->left);
                continue;
            }
            
            return false;
        }
        
        return true;
    }
    
};
