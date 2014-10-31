class Solution {
public:
    bool isPalindrome(string s) {
        
        if (s.length() == 0) {
            return true;
        }
        
        int start = 0;
        int end = s.length() - 1;
        
        while (start < end) {
            if ( !isalnum(s[start]) ) { start++; continue; }
            if ( !isalnum(s[end]) ) { end--; continue; }
            
            // could use tolower()
            if ( toupper(s[start]) != toupper(s[end]) ) {
                return false;
            }
            
            start++;
            end--;
        }
        
        return true;
        
    }
};
