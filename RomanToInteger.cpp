class Solution {
public:
    int romanToInt(string s) {
        
        map <char, int> converter;
        converter['I'] = 1;
        converter['V'] = 5;
        converter['X'] = 10;
        converter['L'] = 50;
        converter['C'] = 100;
        converter['D'] = 500;
        converter['M'] = 1000;
        
        int position = 0;
        int convNum = 0;
        char curChar;
        
        while (position <= s.size() - 1) {

            curChar = s[position];
            int curNum = converter[curChar];
            
            convNum += curNum;
            
            // finished
            if ((position + 1) == s.length()){
                break;
            }
            
            //if not finished, determine if we need to use subtraction
            int nextNum = converter[s[position+1]];
            
            if (nextNum > curNum) {
                convNum -= curNum; // undo
                convNum += (nextNum - curNum); // correct calc
                position ++; //increment position to account for using two numbers
            }
            
            position++;
        }
        
        return convNum;
    }
};
