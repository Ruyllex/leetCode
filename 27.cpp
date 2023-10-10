#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

/*
Remove Element

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the elements which are not equal to val. 
    The remaining elements of nums are not important as well as the size of nums.
    Return k

*/

class Solution {
public:
    void showResult(vector<int> resultado){
        for(int i = 0; i < resultado.size(); i++){
            cout << resultado[i] << ",";
            }
        }
    int removeElement(vector<int>& nums, int val) {
        int contador = 0;
        int tamanioNums = nums.size();
        for(int i = 0; i != tamanioNums; i++){
            if(nums[i] == val){
                contador++;
                nums[i] = 100;
            }
        }
        sort(nums.begin(),nums.end());
        int contadorAux = contador;
        while(contadorAux != 0){
            nums.pop_back();
            contadorAux--;
        }
        return (tamanioNums - contador);
        }
};

int main() {
    Solution solution; 
    vector<int> nums = {0,1,2,2,3,0,4,2};
    int val = 2; 
    int answer = solution.removeElement(nums,val);
    cout << answer << endl;
    solution.showResult(nums);
    return 0;
}