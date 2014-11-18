class Solution {
public:
    vector<int> getRow(int rowIndex) {
        int row [rowIndex + 1];
        row[0] = 1;
        for (int i = 1; i <= rowIndex; i++) {
            row[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                row[j] = row[j] + row[j - 1];
            }
        }
        
        vector<int> result = vector<int>(row, row + sizeof row / sizeof row[0]);
        return result;
    }
};
