/**
 * Write a function to find the longest common 
 * prefix string amongst an array of strings.
 */
 
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int position = 0;

        if (strs == null || strs.length == 0) {
            return "";
        }
        
        for (int i = 0; i < strs[0].length(); i++) {
            
            char curChar = strs[0].charAt(position);
            
            for (String s: strs) {
                if (position > s.length()-1 || 
                    s.charAt(position) != curChar) {
                    return strs[0].substring(0,position);
                }
            }

            position++;
        }
        
        return strs[0];
    }
}
