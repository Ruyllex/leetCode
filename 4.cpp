#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
*/


class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        
    }
};

int main() {
Solution solution; 
vector<int> nums1  = {1,3};
vector<int> nums2  = {2};
int answer = solution.findMedianSortedArrays(nums1,nums2);
cout << "output: " << answer << endl; 
vector<int> nums3  = {1,2};
vector<int> nums4  = {3,4};
int answer2 = solution.findMedianSortedArrays(nums3,nums4);
cout << "output: " << answer2 << endl;
}