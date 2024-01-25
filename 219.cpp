#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <unordered_map>
using namespace std;

/*
Given an integer array nums and an integer k,
return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
*/



class Solution {
public:
bool containsNearbyDuplicate(vector<int>& nums, int k) {
    unordered_map<int, int> lastSeen;
    for (int i = 0; i < nums.size(); ++i) {
        if (lastSeen.find(nums[i]) != lastSeen.end() && i - lastSeen[nums[i]] <= k) {
            return true;
        }
        lastSeen[nums[i]] = i;
    }
    return false;
    }
};



int main(){
    Solution solution;
    vector<int> nums1 = {1,2,3,1};
    int k1 = 3;
    cout << solution.containsNearbyDuplicate(nums1,k1) << endl;
    vector<int> nums2 = {1,0,1,1};
    int k2 = 1;
    cout << solution.containsNearbyDuplicate(nums2,k2) << endl;
    vector<int> nums3 = {1,2,3,1,2,3};
    int k3 = 2;
    cout << solution.containsNearbyDuplicate(nums3,k3) << endl;
    return 0;
}