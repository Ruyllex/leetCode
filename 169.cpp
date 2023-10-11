#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;


/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.
*/

class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int,int> map;
        float largeVector = nums.size();
        float counter = 0;
        for(int i = 0; i != largeVector;i++){
            if(map.find(nums[i]) != (map.end())){
                map[nums[i]]++;
            }
            else{
                map[nums[i]] = 1;
            }
        }
        int aux = map[nums[0]];
        int result = - 1;
        for (const auto& par : map) {
            if(aux <= par.second ){
                aux = par.second;
                result = par.first;
            }
            else{
                aux = aux;
            }
        }
        return result;
    }
};

int main() {
Solution solution; 
vector<int> nums = {3,2,3};
int answer = solution.majorityElement(nums);
cout << "output: " << answer << endl; 
vector<int> nums1 = {2,2,1,1,1,2,2};
int answer1 = solution.majorityElement(nums1);
cout << "output: " << answer1;
}