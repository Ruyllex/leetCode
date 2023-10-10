#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

/*
Remove Duplicates from Sorted Array
Given an integer array nums sorted in non-decreasing order, 
remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

    # Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
    The remaining elements of nums are not important as well as the size of nums.
    # Return k.

*/
class Solution {
public:
    void mostrarResultado(vector<int> resultado){
        for(int i = 0; i < resultado.size(); i++){
            cout << resultado[i] << ",";
            }
        }
    int removeDuplicates(vector<int>& nums) {
        int contador = 0; 
        int i = 0;
        while(i < (nums.size() - 1)){
            if(nums[i] == nums[i + 1]){
                nums[i] = 100;
                contador++;
            }
            else{
                i++;
            }
        }
        sort(nums.begin(),nums.end());
        int j = 0;
        while(j != contador){
            nums.pop_back();
            j++;
            }
            return nums.size();
        }
};

int main() {
Solution solution; 
vector<int> nums = {0,0,1,1,1,2,2,3,3,4};
int answer = solution.removeDuplicates(nums);
cout << "output: " << answer << endl;
solution.mostrarResultado(nums); 
cout << endl;
vector<int> nums1 = {1,1,2};
int answer1 = solution.removeDuplicates(nums1);
cout << "output: " << answer1 << endl;
solution.mostrarResultado(nums1);
 
vector<int> nums2 = {1,1,1,2};
int answer2 = solution.removeDuplicates(nums2);
cout << "output: " << answer2 << endl;
solution.mostrarResultado(nums2); 
return 0;
}