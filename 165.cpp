#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;

/*
Compare Version Numbers

Given two version numbers, version1 and version2, compare them.
Version numbers consist of one or more revisions joined by a dot '.'. 
Each revision consists of digits and may contain leading zeros. 
Every revision contains at least one character. 
Revisions are 0-indexed from left to right, with the leftmost revision being revision 0, the next revision being revision 1, and so on. 
For example 2.5.33 and 0.1 are valid version numbers.
To compare version numbers, compare their revisions in left-to-right order. 
Revisions are compared using their integer value ignoring any leading zeros. 
This means that revisions 1 and 001 are considered equal. 
If a version number does not specify a revision at an index, 
then treat the revision as 0. For example, version 1.0 is less than version 1.1 because their revision 0s are the same, 
but their revision 1s are 0 and 1 respectively, and 0 < 1.


If version1 < version2, return -1.
If version1 > version2, return 1.
Otherwise, return 0.
*/

class Solution {
public:
    int compareVersion(string version1, string version2) {
        for(int i = 0; i != version1.size();i++){
            if(version1[i] < version2[i]){
                return -1;
            }
            if(version1[i] > version2[i]){
                return 1;
            }
            if(version1[i] == version2[i]){
                return 0;
            }
        }
    }
};

int main(){
    Solution solution;
    string version1 = "1.01";
    string version2 = "1.001";
    cout << solution.compareVersion(version1,version2) << endl;
    string version3 = "1.0";
    string version4 = "1.0.0";
    cout << solution.compareVersion(version3,version4) << endl;
    string version5 = "0.1";
    string version6 = "1.1";
    cout << solution.compareVersion(version5,version6) << endl;
}