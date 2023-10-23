#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;
/*
Plus One
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order. 
The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
*/

class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int lastIndex = digits.size() - 1;
        digits[lastIndex]++;
        if(digits[lastIndex] == 10){
            digits[lastIndex];
        }
        return digits;
    }
};


void imprimir(vector<int> digits){
    for(int i = 0; i != digits.size(); i++){
        cout << digits[i];
    }
    cout << endl;
}

int main() {
    Solution solution; 
    vector<int> digits = {1,2,3};
    imprimir(solution.plusOne(digits));

    vector<int> digits1 = {4,3,2,1};

    imprimir(solution.plusOne(digits1));

    vector<int> digits2 = {9};

    imprimir(solution.plusOne(digits2));
}