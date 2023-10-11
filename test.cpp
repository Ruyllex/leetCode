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
    if( 0.7 < 0.5 ){
        cout << 1 << endl;
    }
    else{
        cout << 0 << endl;
    }
    return 0;
}