#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string>
#include <unordered_set>

using namespace std;

/*
How Many Numbers Are Smaller Than the Current Number

Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.
*/


class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        vector<int> answer;
        int numsSize = nums.size();
        for(int i = 0; i != numsSize; i++){
            int aux = 0;
            for(int j = 0;j != numsSize; j++){
                if(i != j && nums[i] > nums[j]){
                    aux++;
                }
                if(j == (nums.size() - 1)){
                    answer.push_back(aux);
                }
            }
        }
        return answer;
    }
};


void printVector(vector<int> v){
    for(int i = 0; i != v.size();i++){
        cout << v[i];
    }
    cout << endl;
}

int main(){
    Solution solution;
    vector<int> nums = {6,5,4,8};
    vector<int> answer = solution.smallerNumbersThanCurrent(nums);
    vector<int> nums1 = {7,7,7,7};
    printVector(answer);
    vector<int> answer2 =  solution.smallerNumbersThanCurrent(nums1);
    printVector(answer2); 
}