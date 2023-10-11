#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string>
using namespace std;


/*
Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

*/
class Solution {
public:
  public:  
    string longestCommonPrefix(vector<string>& strs) {
    if (strs.empty()) {
        return "";
    }
    sort(strs.begin(), strs.end(), [](const string& a, const string& b) {
        return a.length() < b.length();
    });

    string firstWord = strs[0];
    string result;

    for (int j = 0; j < firstWord.length(); j++) {
        char currentChar = firstWord[j];

        for (int i = 1; i < strs.size(); i++) {
            if (strs[i][j] != currentChar) {
                return result;
            }
        }

        result += currentChar;
    }

    return result;
    }
};

int main() {
    Solution solution;
    vector<string> strs = {"flower","flow","flight"};
    cout << "output: " << solution.longestCommonPrefix(strs) << endl;
    vector<string> strs1 = {"dog","racecar","car"};
    cout << "output: " << solution.longestCommonPrefix(strs1) << endl;
    vector<string> strs2 = {"ab", "a"};
    cout << "output: " << solution.longestCommonPrefix(strs2) << endl;   
    vector<string> strs3 = {"",""};
    cout << "output: " << solution.longestCommonPrefix(strs3) << endl;
    vector<string> strs4 = {"flower","flower","flower","flower"};
    cout << "output: " << solution.longestCommonPrefix(strs4) << endl;
    vector<string> strs5 = {"aa","aa"};
    cout << "output: " << solution.longestCommonPrefix(strs5) << endl; 
    vector<string> strs6 = {"cir","car"};
    cout << "output: " << solution.longestCommonPrefix(strs6) << endl; 
}
