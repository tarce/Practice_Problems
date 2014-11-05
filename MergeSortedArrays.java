/**
 * Given two sorted integer arrays A and B, 
 * merge B into A as one sorted array.
 * 
 * Note: You may assume that A has enough space 
 * (size that is greater or equal to m + n) to 
 * hold additional elements from B. The number of 
 * elements initialized in A and B are m and n 
 * respectively.
 * 
 * The above assumption indicates that you should not
 * create a new array for your solution, but instead
 * utilize the arrays given, returning your solution in
 * A.  Also, return is void.
 */

public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        
        //Let's start adding elements at the back.
        // We know the size of A is m+n.
        
        int curPos = m+n-1; //last position in A
        int lastA = m-1;    //last position of elements in A
        int lastB = n-1;    //last position of elements in B
        
        // while there are elements still in A and B continue looping
        // putting the bigger element in the back of A
        while (lastA >= 0 && lastB >= 0){
            
            if (A[lastA] >= B[lastB]) {
                A[curPos] = A[lastA];
                lastA--;
            }
            else {
                A[curPos] = B[lastB];
                lastB--;
            }
            
            curPos--;
        }
        
        // at this point either A ran out or B ran out or both ran out
        // if B ran out, no problem b/c we are putting elements
        // in A, so just leave the rest of the A array alone
        
        // if A ran out, check to make sure there are still elements left in B,
        // and if so put them in A
        
        if (lastB >= 0) {
            while (curPos >= 0) {
                A[curPos] = B[lastB];
                curPos--;
                lastB--;
            }
        }
    }
}
