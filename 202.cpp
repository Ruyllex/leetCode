#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
#include <cmath>

using namespace std;

/*
Happy Number
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

    Starting with any positive integer, replace the number by the sum of the squares of its digits.
    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.

*/

class Solution {
public:
    bool includeNumberOne(int n){
        string numberString = to_string(n);
        for(int i = 0; i != numberString.size();i++){
            if(numberString[i] == '1' ){
                return true;
            }
        }
        return false;

    }
    int transform(int n){
        string Number =  to_string(n);
        int newNumber = 0;
        int NumberSize = Number.size();
        for(int i = 0; i != NumberSize; i++){
            newNumber += pow(Number[i] - '0',2); 
        }
        return newNumber;
    }

    bool isHappy(int n) {
        if(n == 1){
            return true;
        }
        if( n < 3){
            return false;
        }
        int number = n;
        while( number != 1 && !includeNumberOne(number)){
            number = transform(number);    
        }
        if(number == 0 || includeNumberOne(number)){
            return false;
        }
        return true;
    }
};


int main() {
    Solution solution; 
    if(solution.isHappy(2)){
        cout << "congratulations" << endl;
    }
}
