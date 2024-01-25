#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
 
class Solution {
public:
    int test(){
        int number = 64;
        number <<= 3;
        cout << number << endl;
    }
};

int main() {
    Solution solution;
    solution.test();
    return 0;
}


