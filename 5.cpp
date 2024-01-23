#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;
/*
Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.
*/

class Solution {
public:
    string longestPalindrome(string s) {
        
    }
};

int main() {
Solution solution; 
string s = "babad";
string answer = solution.longestPalindrome(s);
cout << "output: " << answer << endl; 
string s1 = "cbbd";
string answer1 = solution.longestPalindrome(s1);
cout << "output: " << answer1 << endl;
}