/**
 * Implement atoi to convert a string to an integer.
 * 
 * Requirements for atoi:
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting
 * from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them
 * as a numerical value.
 * 
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the
 * behavior of this function.
 * 
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either
 * str is empty or it contains only whitespace characters, no conversion is performed.
 * 
 * If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values,
 * INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 **/

public class Solution {
    public int atoi(String str) {
        
        int sign = 1;
        int pos = 0;
        double result = 0;
        
        if (str.length() == 0 || str == null) {
            return (int)result;
        }
        
        str = str.trim();
        
        if (str.charAt(pos) == '-') {
            sign = -1;
            pos++;
        }
        else if (str.charAt(pos) == '+') {
            pos++;
        }
        
        while (pos <= str.length() - 1 && Character.isDigit(str.charAt(pos)) ) {
            result *= 10;
            result += (str.charAt(pos) - '0');
            pos++;
        }
        
        result *= sign;
        
        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }
        
        if (result < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }
        
        return (int) result;
        
    }
}
