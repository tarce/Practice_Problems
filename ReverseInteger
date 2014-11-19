/**
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * 
 * If the integer's last digit is 0, it will be ignored ie 100 becomes 1
 * 
 * Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. 
 * 
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 **/

public class Solution {
    public int reverse(int x) {
        
        long reverse = 0;

        while (x != 0) {
            reverse *=  10;
            reverse += x % 10;
            x = x / 10;
        }
        
        //overflow check
        if (reverse > Integer.MAX_VALUE ||
            reverse < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int)reverse;
    }
}
