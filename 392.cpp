#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string.h>
using namespace std;

/*
Is Subsequence


Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without 
disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
*/

class Solution {
public:
    bool isSubsequence(string s, string t) {
        int sLarge = s.size();
        int tLarge = t.size();
        int count = 0;
        for(int i = 0; i != tLarge; i++ ){
            if( s[count] == t[i] ){
                count++;
            }
        }
        return count == sLarge;
    }
};

int main(){
    Solution solution;
    string s = "abc";
    string t = "ahbgdc";
    cout << solution.isSubsequence(s,t) << endl;
    string s1 = "axc";
    string t2 = "ahbgdc";
    cout << solution.isSubsequence(s1,t2) << endl;
}