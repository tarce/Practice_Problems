/*
* Given a string, determine if it is a palindrome, 
* considering only alphanumeric characters and ignoring cases.
* For the purpose of this problem, we define empty string as
* valid palindrome.
*/

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // null string case (string object not instantiated)
        if (s == null) {
            return false;
        }
        
        // transform s to the above standard
        s= s.replaceAll("[^a-zA-Z0-9]","");
        s= s.toLowerCase();
        
        // empty string case
        if (s.length() == 0) {
            return true;
        }
        
        int stop = (s.length() / 2) + 1;
        
        //the below would also work, however is unecessary
        //int stop = s.length();
        
        for (int i = 0; i < stop; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }
}
