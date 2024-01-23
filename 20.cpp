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
        map<char,int> diccionario;
        diccionario[openParenthesis] = 0;
        diccionario[openKeys] = 0;
        diccionario[openBrackets] = 0;

        for(int i = 0; i != s.size(); i++){
            if(s[i] == openBrackets){
                diccionario[openBrackets]++;
            }
            if(s[i] == openKeys){
                diccionario[openKeys]++;
            }
            if(s[i] == openParenthesis){
                diccionario[openParenthesis]++;
            }
            if(s[i] == closeBrackets){
                diccionario[openBrackets]--;
            }
            if(s[i] == closeKeys){
                diccionario[openKeys]--;
            }
            if(s[i] == closeParenthesis){
                diccionario[openParenthesis]--;
            }
            for (const auto& par : diccionario) {
                if( par.second == (-1) ){
                    break;
                }
            }
        }
        for (const auto& par : diccionario) {
            if( par.second != 0 ){
                return false;
            }
        }
        return true;
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