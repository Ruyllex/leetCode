#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
#include <cmath>

using namespace std;

/*
Merge Strings Alternately

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
If a string is longer than the other, append the additional letters onto the end of the merged string.



*/

class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string  result = "";
        int sizeWord1 = word1.size();
        int sizeWord2 = word2.size();
         int minSize = min(sizeWord1, sizeWord2); 
        for(int i = 0; i < minSize; i++) {
            result += word1[i];
            result += word2[i];
        }

        if(sizeWord1 > sizeWord2) {
            result += word1.substr(minSize);
        } else {
            result += word2.substr(minSize);
        }
        return result;
    }
};

int main(){
    Solution solution;
    string word1 = "abc";
    string word2 = "pqr";
    cout << solution.mergeAlternately(word1,word2) << endl;
    string word3 = "ab";
    string word4 = "pqrs";
    cout << solution.mergeAlternately(word3,word4) << endl;
    string word5 = "abcd";
    string word6 = "pq";
    cout << solution.mergeAlternately(word5,word6) << endl;
}