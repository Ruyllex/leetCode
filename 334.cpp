#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string.h>
using namespace std;

/*
Increasing Triplet Subsequence


Given an integer array nums, 
return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k].
If no such indices exists, return false.
*/


class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
        for(int i = 0; i != (nums.size() - 2);i++){
            if((nums[i] < nums[i + 1]) && (nums[i + 1] < nums[i + 2])){
                return true;
            }
        }
        return false;
    }
};

int main(){
    Solution solution;
    vector<int> nums = {1,2,3,4,5};
    cout << solution.increasingTriplet(nums) << endl;
    vector<int> nums1 = {5,4,3,2,1};
    cout << solution.increasingTriplet(nums1) << endl;
    vector<int> nums2 = {2,1,5,0,4,6};
    cout << solution.increasingTriplet(nums2) << endl;
    vector<int> nums3 = {20,100,10,12,5,13};
    cout << solution.increasingTriplet(nums3 ) << endl;  

}