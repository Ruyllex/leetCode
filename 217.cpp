#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;


/*
Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
*/
void imprimirVector(const std::vector<int>& vec) {
    for (int elemento : vec) {
        cout << elemento << " ";
    }
    cout << endl;
}

class Solution {
public:
    bool check(vector<int> listaNumeros,int numeroCheck){
        bool x = false;
        for(int i = 0; i != listaNumeros.size();i++){
            if( listaNumeros[i] == numeroCheck ){
                x = true;
            }
        }
        return x;
    }

    bool containsDuplicate(vector<int>& nums){
        vector<int>listaNumeros = {};
        bool found = false;
        int largeNums = nums.size();
        for(int i = 0; i != largeNums;i++){
            if(check(listaNumeros,nums[i])){
                found = true;
                break;
            }
            else{
                listaNumeros.push_back(nums[i]);
            }
        }
        return found;
    }
};

int main() {
Solution solution; 
vector<int> nums = {1,2,3,1};
int answer = solution.containsDuplicate(nums);
cout << "output: " << answer << endl; 
vector<int> nums1 = {1,2,3,4};
int answer1 = solution.containsDuplicate(nums1);
cout << "output: " << answer1 <<endl;
vector<int> nums2 = {1,1,1,3,3,4,3,2,4,2};
int answer2 = solution.containsDuplicate(nums2);
cout << "output: " << answer2 << endl;
}