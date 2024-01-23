#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;
/*
Roman to Integer

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II.
The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.
*/

class Solution {
public:
    int romanToInt(string s) {
        int result = 0;
        map<char,int> listValues = {
        {'I', 1},
        {'V', 5},
        {'X', 10},
        {'L', 50},
        {'C', 100},
        {'D', 500},
        {'M', 1000}
        };
        int largeString = s.size();
        for(int i = 0;i != (largeString + 1); i++){
            if(listValues[s[i]] >= listValues[s[i + 1]] ){
                result += listValues[s[i]];
            }
            else{
                result -= listValues[s[i]];
            }
        }
        return result;
    }
};
int main() {
Solution solution; 
string s = "III";
int answer = solution.romanToInt(s);
cout << "output: " << answer << endl; 
string s1 = "LVIII";
int answer1 = solution.romanToInt(s1);
cout << "output: " << answer1 << endl;
string s2 = "MCMXCIV";
int answer2 = solution.romanToInt(s2);
cout << "output: " << answer2 << endl;
string s3 = "MMMDCCCLXXXVIII";
int answer3 = solution.romanToInt(s3);
cout << "output: " << answer3 << endl;
}