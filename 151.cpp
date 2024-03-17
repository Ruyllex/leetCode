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
        vector<string> wordList;
        string result = "";
        string auxStr;
        s = s + " ";
        for(int i = 0; i != s.size();i++){
            if(s[i] != ' '){
                auxStr += s[i];
            }
            else{
                if(auxStr != ""){
                    wordList.push_back(auxStr);
                    auxStr = "";
                }
            }
        }

        for(int j = (wordList.size() - 1) ; j != -1; j--){
            result += wordList[j] + " ";

        }
        return result.substr(0, result.size() - 1);;
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