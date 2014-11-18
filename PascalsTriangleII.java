/**
 * Given an index k, return the kth row of the Pascal's triangle.
 * 
 * For example, given k = 3,
 * Return [1,3,3,1].
 * 
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 */


/**
 * For an O(k) space solution we can perform calculations
 * in-line.
 * 
 * Note that there is a formula to calculate
 * the resulting numbers, thus leading to an O(n)
 * solution.  This solution uses O(k) space, however
 * takes the same O(n^2) time that the original Pascal's
 * Triangle problem takes.
 */

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        Integer[] row = new Integer[rowIndex + 1];
        
        row[0] = 1;
        for (int i = 1; i <= rowIndex; i++) {
            row[i] = 1;
            // start from the back so that we 
            // don't overwrite the data that we need
            for (int j = i - 1; j > 0; j--) {
                row[j] = row[j]+row[j-1];
            }
        }
        
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(row));
        return result;
    }
}
