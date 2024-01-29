#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;

/*
Find the Index of the First Occurrence in a String

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, 
or -1 if needle is not part of haystack.
*/  

class Solution {
public:
    int strStr(string haystack, string needle) {
        if (needle.size() > haystack.size()) return -1;
        for (int i = 0; i <= haystack.size() - needle.size(); ++i) {
            int j = 0;
            while (j < needle.size() && haystack[i + j] == needle[j]) {
                ++j;
            }
            if (j == needle.size()) return i; 
        }
        return -1; 
    }
};


int main() {
    Solution solution; 
    string haystack = "sadbutsad";
    string needle = "sad";
    int answer = solution.strStr(haystack, needle);
    cout << "output: " << answer << endl; 
    string haystack1 = "leetcode";
    string needle1 = "leeto";
    int answer1 = solution.strStr(haystack1, needle1);
    cout << "output: " << answer1 << endl;
    string haystack2 = "mississippi";
    string needle2 = "issip";
    int answer2 = solution.strStr(haystack2, needle2);
    cout << "output: " << answer2 << endl;
    string haystack3 = "mississippi";
    string needle3 = "sipp";
    int answer3 = solution.strStr(haystack3, needle3);
    cout << "output: " << answer3 << endl;
    }