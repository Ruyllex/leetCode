#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;

/*
Search Insert Position


Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
*/


class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int i;
        int numsLarge = nums.size();
        for(i = 0; i != numsLarge; i++){
            if( nums[i] > target || nums[i] == target ){
                return i;
            }
            if((i + 1) == numsLarge){
                return numsLarge;
            }
        }
        return false;
    }
};



int main() {
    Solution solution; 
    vector<int> nums1  = {1,3,5,6};
    int target  = 5;
    int answer = solution.searchInsert(nums1,target);
    cout << "output: " << answer << endl; 
    vector<int> nums2  = {1,3,5,6};
    int target1  = 2;
    int answer2 = solution.searchInsert(nums2,target1);
    cout << "output: " << answer2 << endl;
    vector<int> nums3  = {1,3,5,6};
    int target2  = 7;
    int answer3 = solution.searchInsert(nums3,target2);
    cout << "output: " << answer3  << endl;
}