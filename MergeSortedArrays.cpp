class Solution {
public:
    void merge(int A[], int m, int B[], int n) {
        
        int curPos = m+n-1;
        int lastA = m-1;
        int lastB = n-1;
        
        while (lastA >= 0 && lastB >=0) {
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
        
        if (lastB >= 0) {
            while (curPos >= 0) {
                A[curPos] = B[lastB];
                lastB--;
                curPos--;
            }
        } 
    }
};
