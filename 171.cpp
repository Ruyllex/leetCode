#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;


/*
Excel Sheet Column Number

Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
*/
class Solution {
public:
    int titleToNumber(string columnTitle) {
        int result = 0;
        for(int i = 0; i < columnTitle.size(); i++){
            result = result * 26 + (columnTitle[i] - 'A' + 1);
        }
        return result;
    }
};

int main(){
    Solution solution;
    string s = "A";
    cout << solution.titleToNumber(s) << endl; // Output: 1
    string s1 = "AB";
    cout << solution.titleToNumber(s1) << endl; // Output: 28
    string s3 = "ZY";
    cout << solution.titleToNumber(s3) << endl; // Output: 701
}