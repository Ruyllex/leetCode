#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
#include <cmath>

using namespace std;

/*
Concatenation of Array

Given an integer array nums of length n, 
you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
*/

class Solution {
public:
    vector<int> getConcatenation(vector<int> nums) {
        vector<int> ans;
        int largeVector = nums.size();
        int aux = 0;
        for(int i = 0; i != (largeVector * 2); i++){
            ans.push_back(nums[aux]);
            aux++;
            if(aux == largeVector){
                aux = 0;
            }
        }        
        return ans;
    }
};

void imprimirVector(vector<int> vector) {
    for (int elemento : vector) {
        cout << elemento << ",";
    }
    cout << endl;
}


int main(){
    Solution solution;
    vector<int> nums = {1,2,1};
    vector<int> ans = solution.getConcatenation(nums);
    vector<int> nums1 = {1,3,2,1};
    vector<int> ans1 = solution.getConcatenation(nums1);
    imprimirVector(ans);
    imprimirVector(ans1);
}