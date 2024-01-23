#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string.h>
#include <unordered_map>
using namespace std;

/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

*/

class Solution {
public:
    int firstUniqChar(string s) {
        unordered_map<char,int> diccionario;
        for(char character : s){
            diccionario[character]++;
        }
        int i = 0;
        for (int i = 0; i < s.size(); ++i) {
            if (diccionario[s[i]] == 1) {
                return i;
            }
        }
        return -1;
    }
};
int main(){
    Solution solution;
    string s = "leetcode";
    cout << solution.firstUniqChar(s) << endl;
    string s1 = "loveleetcode";
    cout << solution.firstUniqChar(s1) << endl;
    string s2 = "aabb";
    cout << solution.firstUniqChar(s2) << endl;
}