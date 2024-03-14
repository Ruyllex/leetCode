#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string.h>
using namespace std;

/*
Reverse Vowels of a String
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

*/


bool isVocal(char s){
    vector<char> vocals = {'a','i','u','e','o'};
    for (int i = 0 ; i <  vocals.size() ; i++) {
        if (tolower(s) == vocals[i]) return true;
    }
    return false;
}

class Solution {
public:
    string reverseVowels(string s) {
        vector<char> aux = {};
        for (char c : s) {
            if (isVocal(c)) {
                aux.push_back(c);
            }
        }
        int p = aux.size() - 1;
        for (int j = 0; j < s.size(); ++j) {
            if (isVocal(s[j])) {
                s[j] = aux[p];
                p--;
            }
        }
    return s;
    }
};


int main(){
    Solution solution;
    string s = "hello";
    cout << solution.reverseVowels(s) << endl;
    string s1 = "leetcode";
    cout << solution.reverseVowels(s1) << endl;
}