#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
#include <cmath>

using namespace std;


/*
Build Array from Permutation

Given a zero-based permutation nums (0-indexed), 
build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.lengthand return it.
A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
*/

class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
        vector<int> ans;
        int largeVector = nums.size();
        for(int i = 0; i != largeVector; i++){
            ans.push_back(nums[nums[i]]);
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
    vector<int> nums = {0,2,1,5,3,4};
    vector<int> nums1 = {5,0,1,2,3,4};
    vector<int> ans = solution.buildArray(nums);
    vector<int> ans1 = solution.buildArray(nums1);
    imprimirVector(ans);
    imprimirVector(ans1);
}