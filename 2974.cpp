#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;
/*
Minimum Number Game

You are given a 0-indexed integer array nums of even length and there is also an empty array arr. 
Alice and Bob decided to play a game where in every round Alice and Bob will do one move. The rules of the game are as follows:

Every round, first Alice will remove the minimum element from nums, and then Bob does the same.
Now, first Bob will append the removed element in the array arr, and then Alice does the same.
The game continues until nums becomes empty.

Return the resulting array arr.
*/

class Solution {
public:
    int Min(vector<int>& numeros) {
        int min = numeros[0];
        for (int i = 1; i < numeros.size(); ++i) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }
void deleteNumber(vector<int>& numeros, int numero) {
    auto it = find(numeros.begin(), numeros.end(), numero);
    if (it != numeros.end()) {
        numeros.erase(it);
    }
}
    vector<int> numberGame(vector<int>& nums) {
        vector<int> arr;
        int aux;
        int numsLarge = nums.size();
        for(int i = 0; i != numsLarge;i++){
            int min = Min(nums);
            if(i % 2 == 0){
                aux = min;
                deleteNumber(nums,min);
            }
            else{
                arr.push_back(min);
                arr.push_back(aux);
                deleteNumber(nums,min);
            }
        }
        return arr;
    }
};
void imprimirArray(vector<int> arr, int longitud) {
    cout << "[";
    for (int i = 0; i < longitud; i++) {
        cout << arr[i];
        if (i != longitud - 1) {
            cout << ", ";
        }
    }
    cout << "]" << endl;
}

int main(){
    Solution solution;
    vector<int> nums = {5,4,2,3};
    vector<int> ans = solution.numberGame(nums);
    imprimirArray(ans,ans.size());
    vector<int> nums1 = {2,5};
    vector<int> ans1 = solution.numberGame(nums1);
    imprimirArray(ans1,ans1.size());
}