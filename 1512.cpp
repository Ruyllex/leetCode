#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string>
#include <unordered_set>

using namespace std;
/*
Number of Good Pairs

Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*/

class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int answer = 0;
        for(int i = 0; i != nums.size(); i++){
            for(int j = i + 1; j != nums.size(); j++){
                if(nums[i] == nums[j]){
                    answer++;
                }
            }
        }
        return answer;
    }
};

int main(){
    Solution solution;
    vector<int> nums = {1,2,3,1,1,3};
    cout << solution.numIdenticalPairs(nums) << endl;
    vector<int> nums2 = {1,1,1,1};
    cout << solution.numIdenticalPairs(nums2) << endl;
    vector<int> nums3 = {1,2,3};
    cout << solution.numIdenticalPairs(nums3) << endl;
}