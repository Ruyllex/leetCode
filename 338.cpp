#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string.h>
#include <bitset>
using namespace std;

/*
Counting Bits

Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), 
ans[i] is the number of 1's in the binary representation of i.
*/

class Solution {
    public:
        string intToBinary(int num) {
            return bitset<sizeof(int) * 8>(num).to_string();
        }
        int countOne(string s){
            int ans = 0;
            for(int i = 0; i != s.size();i++){
                if(s[i] == '1'){
                    ans++;
                }
            }
            return ans;
        }
        vector<int> countBits(int n) {
            vector<int> ans;
            for(int i = 0; i != (n + 1);i++){
                ans.push_back(countOne(intToBinary(i)));
            }
            return ans;
        }
};


void printVector(vector<int> v){
    for(int i : v){
        cout << i << ',';
    }
    cout << endl;
}
int main(){
    Solution solution;
    printVector(solution.countBits(2));
    printVector(solution.countBits(5));
}