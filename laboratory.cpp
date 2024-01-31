#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
 
class Solution {
public:
    int test(){
        return 'b' - 97;
    }
};

int main() {
    Solution solution;
    cout << solution.test() << endl;
    return 0;
}


