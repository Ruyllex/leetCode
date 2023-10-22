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
    }