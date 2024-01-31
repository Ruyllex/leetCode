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
        char letra;
        for(int i = 0; i != columnTitle.size(); i++){
            letra = tolower(columnTitle[i]);
            result = result + (letra - 97)*27*i;
            if(i == 0) result += letra - 96;
        }
        return result;
    }
};

int main(){
    Solution solution;
    string s = "A";
    cout << solution.titleToNumber(s) << endl;
    string s1 = "AB";
    cout << solution.titleToNumber(s1) << endl;
    string s3 = "ZY";
    cout << solution.titleToNumber(s3) << endl;
}