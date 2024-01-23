#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string.h>
using namespace std;

/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

*/

class Solution {
public:
    int firstUniqChar(string s) {
        
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