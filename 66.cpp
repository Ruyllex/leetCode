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
        int largoVector = digits.size();
        if(largoVector == 1){
            if(digits[0] == 9){
                return {1,0};
            }
            else{
                digits[0] += 1;
            }
        }
        else{
            digits[largoVector - 1] += 1;
            for(int i = (largoVector - 1); i != -1; i-- ){
                if(digits[i] == 10){
                    digits[i] = 0;
                    if(i == 0){
                        digits.insert(digits.begin(),1);
                        }
                    else{
                        digits[i - 1] += 1;
                        }
                    }
                }
            }
            return digits;
        }

};


void imprimir(vector<int> digits){
    for(int i = 0; i != digits.size(); i++){
        cout << to_string(digits[i]) + ",";
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
    vector<int> digits3 = {9,9};
    imprimir(solution.plusOne(digits3));
}