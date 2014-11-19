class Solution {
public:
    int reverse(int x) {
        long long reverse = 0;

        while (x != 0) {
            reverse *=  10;
            reverse += x % 10;
            x = x / 10;
        }
        
        //overflow check
        if (reverse > INT_MAX ||
            reverse < INT_MIN) {
            return 0;
        }
        
        return reverse;
    }
};
