#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;
/*
Palindrome Number
Given an integer x, return true if x is a
palindrome, and false otherwise.
*/
class Solution {
    public:
        string reverseString(string& String) {
            string reverseString;
            for (int i = String.length() - 1; i >= 0; i--) {
                reverseString += String[i];
            }
            return reverseString;
        }
        bool isPalindrome(int x) {
            string numberToString = to_string(x);
            if(numberToString == reverseString(numberToString)){
                return true;
            }
            else{
                return false;
            }
        }
};

int main() {
Solution solution; 
int number1 = 121;
int answer = solution.isPalindrome(number1);
cout << "output: " << answer << endl; 
int number2 = -121;
int answer2 = solution.isPalindrome(number2);
cout << "output: " << answer2 << endl;
int number3 = 10;   
int answer3 = solution.isPalindrome(number3);
cout << "output: " << answer3 << endl;
}