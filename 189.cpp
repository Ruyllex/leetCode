#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <unordered_map>
#include <algorithm>
using namespace std;
/*
Rotate Array
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

*/

void insert( vector<int>& nums , int LastValue, int largeVector  ){
    vector<int>*Copy = new vector<int>[largeVector];
    Copy->push_back(LastValue);
    for(int i = 0; i != (largeVector - 1); i++){
      Copy->push_back(nums[i]);
    }
    nums = *Copy;
    delete[] Copy;
}


class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int largeVector = nums.size();
        for(int i = 0; i != k; i++){
            int LastValue = nums[largeVector - 1];
            insert(nums,LastValue,largeVector);
        }
        for(int i = 0; i != largeVector; i ++){
            cout << nums[i] << " ";
        }
        cout << endl;
    }
};


int main(){
    Solution solution;
    vector<int> nums1 = {1,2,3,4,5,6,7};
    int k1 = 3;
    solution.rotate(nums1,k1);
    vector<int> nums2 = {-1,-100,3,99};
    int k2 = 2;
    solution.rotate(nums2,k2);
}