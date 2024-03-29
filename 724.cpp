#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string>
#include <unordered_set>


using namespace std;

/*
Find Pivot Index

Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index 
is equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. 
This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.
*/



int calculateValueLeft(vector<int> nums,int pivot){
    int sum = 0;
    for(int i = 0; i != pivot; i++){
        sum += nums[i];
    }
    return sum;
}
int calculateValueRight(vector<int> nums,int pivot){
    int sum = 0;
    for(int i = pivot + 1; i != nums.size(); i++){
        sum += nums[i];
    }
    return sum;
}
    

class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        for(int i = 0; i != nums.size(); i++){
            if (calculateValueLeft(nums , i) == calculateValueRight(nums , i)){
                return i;
            }
        }
        return -1;
    }
};

int main(){
    Solution solution;
    vector<int> test = {1,7,3,6,5,6};
    cout << solution.pivotIndex(test) << endl;
    vector<int> test1 = {1,2,3};
    cout << solution.pivotIndex(test1) << endl;
    vector<int> test2 = {2,1,-1};
    cout << solution.pivotIndex(test2) << endl;
}