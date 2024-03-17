#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string.h>
using namespace std;


/*
Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array
*/

void printVector(vector<int> v){
    for(int i : v){
        cout << i << ',';
    }
}

class Solution {
    public:
        void moveZeroes(vector<int>& nums) {
            if(nums.size() == 1){
                exit;
            }
            int count = 0;
            for(int i = 0; i != nums.size();i++){
                if( nums[i] == 0 ){
                    for(int j = i; j != (nums.size() - 1);j++){
                        nums[j] = nums[j + 1];    
                        }
                    nums[nums.size() - count] = 0;
                    count++;
                    }
                }
            }
        };



int main(){
    Solution solution;
    vector<int> nums = {0,1,0,3,12};
    solution.moveZeroes(nums);
    printVector(nums);
    vector<int> nums1 = {0};
    solution.moveZeroes(nums1);
    printVector(nums1);
}