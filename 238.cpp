#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;
/*
Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
*/

int calculateValue(vector<int> v,int position){
    int answer = 1;
    for(int i = 0; i != v.size();i++){
        if(i != position){
            answer = answer * v[i];
        }
    }
    return answer;
}

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> answer;
        for(int j = 0; j != nums.size();j++){
            answer.push_back(calculateValue(nums,j));
        }
        return answer;
    }
};




void printVector(vector<int> vect){
    for(int i : vect){
        cout << i;
    }
    cout << endl;
}


int main(){
    Solution solution;
    vector<int> nums = {1,2,3,4};
    printVector(solution.productExceptSelf(nums));
    vector<int> nums1 = {-1,1,0,-3,3};
    printVector(solution.productExceptSelf(nums1));
}