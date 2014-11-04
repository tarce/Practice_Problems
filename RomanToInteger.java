/**
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 */

/**
 * A smaller number in front of a larger number means subtraction, 
 * all else means addition. For example, IV means 4, VI means 6.
 * You would not put more than one smaller number in front of a larger 
 * number to subtract. For example, IIV would not mean 3.
 * You must separate ones, tens, hundreds, and thousands as separate items. 
 * That means that 99 is XCIX, 90 + 9, but never should be written as IC. 
 * Similarly, 999 cannot be IM and 1999 cannot be MIM.
 * 
 * I	The numeral one. II is two, III is three. IV is four
 * V	The numeral 5. IV is 4, VI is 6, VII is 7, VIII is 8.
 * X	The numeral 10. IX is 9, XI is 11, etc.
 * L	The numeral 50. XL would be 40.
 * C	The numeral 100. Think of Century having a hundred years. 
 * D	The numeral 500.
 * M	The numeral 1000.
 */


public class Solution {
    public int romanToInt(String s) {
        
        HashMap <Character, Integer> converter = new HashMap();
        converter.put('I', 1);
        converter.put('V', 5);
        converter.put('X', 10);
        converter.put('L', 50);
        converter.put('C', 100);
        converter.put('D', 500);
        converter.put('M', 1000);
        
        s = s.toUpperCase();
        int position = 0;
        Integer convNum = 0;
        Character curChar;
        
        while (position <= s.length() - 1) {

            curChar = s.charAt(position);
            int curNum = converter.get(curChar);
            
            convNum += curNum;
            
            // finished
            if ((position + 1) == s.length()){
                break;
            }
            
            //if not finished, determine if we need to use subtraction
            int nextNum = converter.get(s.charAt(position+1));
            
            if (nextNum > curNum) {
                convNum -= curNum; // undo
                convNum += (nextNum - curNum); // correct calc
                position ++; //increment position to account for using two numbers
            }
            
            position++;
        }
        
        return convNum;
    }
}
