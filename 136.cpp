#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <unordered_map>
#include <algorithm>
#include <cstdint>
using namespace std;

/*
 Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

*/


class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int largeVector = nums.size();
        map<int,int> Map;
        for(int i = 0; i != largeVector;i++){
            Map[nums[i]]++;
        }
        for(const auto&pair : Map){
            if( pair.second == 1 ){
                return pair.first;
            }
        }
    }
};

class Solution1 {
public:
    int singleNumber(vector<int>& nums) {
             int ans=0;
	   for(auto x:nums)
	   ans^=x;
	   return ans;
    }
};

int main(){
    Solution1 solution1;
    Solution solution;
    vector<int> nums = {2,2,1};
    cout << solution.singleNumber(nums) << endl;
    cout << solution1.singleNumber(nums) << endl;
    vector<int> nums1 = {4,1,2,1,2};
    cout << solution.singleNumber(nums1) << endl;
    vector<int> nums2 = {1};
    cout << solution1.singleNumber(nums2) << endl;
    cout << solution.singleNumber(nums2) << endl; 
}