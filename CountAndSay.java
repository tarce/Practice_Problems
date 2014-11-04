/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 *
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * 
 * Note: The sequence of integers will be represented as a string.
 */

public class Solution {
    public String countAndSay(int n) {
        
        String seq = "1";
        if (n == 1) { return seq;}
        
        for (int i = 1; i < n; i++) {
            seq = getNextSeq(seq);
        }
        
        return seq;
    }
    
    public String getNextSeq(String seq) {
        
        String newSeq = "";
        char last = seq.charAt(0);
        int count = 0;
        
        for (int i = 0; i < seq.length(); i++) {
            
            if (seq.charAt(i) == last) {count++;}
            else {
                newSeq += count + "" + last;
                last = seq.charAt(i);
                count = 1;
            }
        }
        
        newSeq += count + "" + last;
        return newSeq;
        
    }
}
