#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
#include <cmath>

using namespace std;


/*
Find the Difference of Two Arrays

Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.
*/

class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        
    }
};
void printVector(vector<vector<int>>& vect){
    for (auto i : vect) {
        for(int x = 0; x != i.size(); ++x){
            cout << i[x];
        }
    }
}


int main(){
    Solution solution;
    vector<int> nums1 = {1,2,3};
    vector<int> nums2 = {2,4,6};
    printVector(solution.findDifference(nums1,nums2));
    vector<int> nums3 = {1,2,3,3};
    vector<int> nums4 = {1,1,2,2};
    

}