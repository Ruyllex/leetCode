#include <iostream>
#include <vector>
using namespace std;

/*
Merge Sorted Array


You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
Merge Sorted Array
*/

class Solution {
public: 
        void showResult(vector<int> resultado, int largoVector){
            for(int i = 0; i < largoVector;i++){
                cout << resultado[i];
                }
            }

        void merge(vector<int>& nums1, int m, vector<int>& nums2, int n){ 
        vector<int> result = {};
        int i = 0;
        int j = 0;
        while ( (i != (m + n))){
            if(nums1[i] < nums2[j]){
                result.push_back(nums1[i]);
                i++;
            }
            else{
                result.push_back(nums2[j]);
                j++;
            }
            if(i == m){
                nums1[i] = 200;
            }

          }
          nums1 = result;      
    }
};

int main() {
    Solution solution; 
    vector<int> nums1 = {1,2,3,0,0,0};
    int m = 3; 
    vector<int> nums2 = {2,5,6};
    int n = 3;
    solution.merge(nums1, m , nums2 ,n);
    solution.showResult(nums1,6);
    return 0;
}