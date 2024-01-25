#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <unordered_map>
#include <algorithm>
#include <cstdint>
using namespace std;

/*
Reverse Bits

Reverse bits of a given 32 bits unsigned integer.

*/
uint32_t reverseNumber(int num) {
    uint32_t reversedNum = 0;
    while (num != 0) {
        int digit = num % 10; 
        reversedNum = reversedNum * 10 + digit; 
        num /= 10; 
    }
    return reversedNum;
}


class Solution {
    public:
        uint32_t reverseBits(uint64_t n) {
        uint32_t result = reverseNumber(n);
        return result;
    }
};

int main(){
    Solution solution;
    uint32_t n = 00000010100101000001111010011100;
    //cout << solution.reverseBits(n) << endl;
    uint32_t n1 = 11111111111111111111111111111101;
    //cout << solution.reverseBits(n1) << endl;

}