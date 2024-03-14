#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;


/*
Reverse Words in a String

Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. Do not include any extra spaces.
*/

class Solution {
public:
    string reverseWords(string s) {
        vector<string> aux;
        string result;
        for( int i = 0; i != s.size( ); i++ ){
            if(s[i] != ' '){
                for(int j = i; j != s.size(); j++){
                    if(s[j] == ' '){
                        aux.push_back(string(s.begin() + i, s.begin() + j));
                    }
                }
            }
        }
        for(int k = 0; k != aux.size(); k++){
            result += aux[k];
        }
        return result;
    }
};

int main(){
    Solution solution;
    string s = "the sky is blue";
    cout <<  solution.reverseWords(s) << endl;
    string s1 = "  hello world  ";
    cout <<   solution.reverseWords(s1) << endl;
    string s2 = "a good   example";
    cout << solution.reverseWords(s2) << endl;
}