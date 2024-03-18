#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string.h>
#include <unordered_map>
using namespace std;

/*
Maximum Average Subarray I

You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
Any answer with a calculation error less than 10-5 will be accepted.
*/
int sumVector(vector<int>& vec) {
    int suma = 0;
    for (int elemento : vec) {
        suma += elemento;
    }
    return suma;
}

class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double maxAvg = 0;
        double aux = 0;
        int sum = 0;
        if(nums.size() == 1){
            return  (double)nums[0];
        }
        if(nums.size() <= k){
            return (double)sumVector(nums) / k;
        }
        for (int i = 0;  i != (nums.size() - k + 1); i++) {
            for (int j = i; j != (i + k); j++) {
                sum += nums[j];
            }
            aux = (double)sum / k;
            if (aux > maxAvg) {
                maxAvg = aux;
            }
            sum = 0;
        }
        return maxAvg;
    }
};


int main(){
    Solution solution;
    vector<int> nums = {1,12,-5,-6,50,3};
    int k = 4;
    cout << solution.findMaxAverage(nums,k) << endl;
    vector<int> nums1 = {5};
    int k1 = 1;
    cout << solution.findMaxAverage(nums1,k1) << endl;
    vector<int> nums2 = {8860,-853,6534,4477,-4589,8646,-6155,-5577,-1656,-5779,-2619,-8604,-1358,-8009,4983,7063,3104,-1560,4080,2763,5616,-2375,2848,1394,-7173,-5225,-8244,-809,8025,-4072,-4391,-9579,1407,6700,2421,-6685,5481,-1732,-8892,-6645,3077,3287,-4149,8701,-4393,-9070,-1777,2237,-3253,-506,-4931,-7366,-8132,5406,-6300,-275,-1908,67,3569,1433,-7262,-437,8303,4498,-379,3054,-6285,4203,6908,4433,3077,2288,9733,-8067,3007,9725,9669,1362,-2561,-4225,5442,-9006,-429,160,-9234,-4444,3586,-5711,-9506,-79,-4418,-4348,-5891};
    int k2 = 93;
    cout << solution.findMaxAverage(nums2,k2) << endl;
}