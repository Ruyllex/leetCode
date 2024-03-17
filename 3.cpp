#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;

/*
Longest Substring Without Repeating Characters


Given a string s, find the length of the longest substring without repeating characters.
*/


class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int Size = s.size();
        string aux = "";
        for(int i = 0; i != Size;   i++){
            for(int j = i; j != Size; j++){
                if( s[i] != s[j] ){
                    aux += s[j];
                }
                if(aux[0] == s[j] && aux.size() != 1){
                    aux = "";
                }

            }
            
        }
        return aux.size();
    }
};

int main() {
    Solution solution; 
    string s = "abcabcbb";
    cout << "answer: " << solution.lengthOfLongestSubstring(s) << endl;
    string s1 = "bbbbb";
    cout << "answer: " << solution.lengthOfLongestSubstring(s1) << endl;
    string s2 = "pwwkew";
    cout << "answer: " << solution.lengthOfLongestSubstring(s2) << endl;
    cout << "hola esto es una prueba de vim" << endl;
}

