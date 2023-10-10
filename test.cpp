#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    void mostrarResultado(vector<int> resultado){
        for(int i = 0; i < resultado.size(); i++){
            cout << resultado[i] << ",";
            }
        }
int removeDuplicates(vector<int>& nums) {
    if (nums.empty()) {
        return 0; 
    }

    int contador = 1;
    
    for (int i = 1; i < nums.size(); i++) {
        if (nums[i] != nums[i - 1]) {
            nums[contador] = nums[i];
            contador++;
        }
    }

    nums.resize(contador);

    return contador;
    }
};

int main() {
Solution solution; 
vector<int> nums = {0,0,1,1,1,2,2,3,3,4};
int answer = solution.removeDuplicates(nums);
cout << answer << endl;
solution.mostrarResultado(nums); 
cout << endl;
vector<int> nums1 = {1,1,2};
int answer1 = solution.removeDuplicates(nums1);
cout << answer1 << endl;
solution.mostrarResultado(nums1); 
return 0;
}