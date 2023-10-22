#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;

/*
Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/

class Solution {
public:
    bool isValid(string s) {
        char openParenthesis = '(';
        char closeParenthesis = ')';
        char openKeys = '{';
        char closeKeys = '}';
        char openBrackets = '[';
        char closeBrackets = ']';
        vector<string> chain = {};
        for(int i = 0; i != s.size(); i++){
            if(s[i] ){

            }
        }
    }
};

int main() {
Solution solution; 
string s = "()";
int answer = solution.isValid(s);
cout << "output: " << answer << endl; 
string s1 = "()[]{}";
int answer1 = solution.isValid(s1);
cout << "output: " << answer1 << endl;
string s2 = "(]";
int answer2 = solution.isValid(s2);
cout << "output: " << answer2 << endl;
string s3 = "([)]";
int answer3 = solution.isValid(s3);
cout << "output: " << answer3 << endl;
}