/**
 * Write a function to find the longest common 
 * prefix string amongst an array of strings.
 */

class Solution {
public:
    string longestCommonPrefix(vector<string> &strs) {
        
        int position = 0;

        if (strs.size() == 0) {
            return "";
        }
        
        for (int i = 0; i < strs[0].length(); i++) {
            
            char curChar = strs[0][position];
            
            for (string s : strs) {
                if (position > s.length()-1 || 
                    s[position] != curChar) {
                    return strs[0].substr(0,position);
                }
            }

            position++;
        }
        
        return strs[0];
    }
};
