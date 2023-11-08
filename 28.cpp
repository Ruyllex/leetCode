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
        int posibleSolution = -1;
        bool primeraPasada = false;
        int j = 0;
        int k = 0;
        for(int i = 0; i != haystack.size();i++){
            if(haystack[i] == needle[j]){
                while( haystack[i] == needle[k] && k != needle.size() ){
                    if(!primeraPasada){
                        posibleSolution = i;
                        primeraPasada = true;
                    }
                    k++;
                }
                if(k == needle.size()){
                    break;
                }
                k = 0;
            }
            }
        return posibleSolution;
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
    }