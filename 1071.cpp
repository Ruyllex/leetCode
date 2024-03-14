#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
#include <cmath>

using namespace std;


/*
Greatest Common Divisor of Strings


For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t 
(i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2

*/

class Solution {
public:
    string gcdOfStrings(string str1, string str2) {
        
    }
};

int main(){
    Solution solution;
    string str1 = "ABCABC";
    string str2 = "ABC";
    cout << solution.gcdOfStrings(str1, str2) << endl;
    string str3 = "ABABAB";
    string str4 = "ABAB";
    cout << solution.gcdOfStrings(str3, str4) << endl;
    string str5 = "LEET";
    string str6 = "CODE";
    cout << solution.gcdOfStrings(str3, str4) << endl;
}