/**
 * Given a binary tree, return the level order traversal of its 
 * nodes' values. (ie, from left to right, level by level).
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
    vector<vector<int> > levelOrder(TreeNode *root) {
        vector<vector<int>> levelOrderTree;
        queue<TreeNode*> q;
        
        if (root == NULL) {
            return levelOrderTree;
        }
        q.push(root);
        
        vector<int> curLevel;
        queue<TreeNode*> tempQ;
        while (!q.empty()) {
            
            while (!q.empty()) {
                
                curLevel.push_back(q.front()->val);
                
                if (q.front()->left != NULL) {
                    tempQ.push(q.front()->left);
                }
                if (q.front()->right != NULL) {
                    tempQ.push(q.front()->right);
                }
                
                q.pop();
            }
            levelOrderTree.push_back(curLevel);
            
            while (!tempQ.empty()) {
                q.push(tempQ.front());
                tempQ.pop();
            }
            curLevel.erase(curLevel.begin(), curLevel.end());

        }
        return levelOrderTree;
    }
};
