#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string>
#include <unordered_set>

using namespace std;
/*
Jewels and Stones


You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. 
Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".
*/

class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        int answer = 0;
        for(int i = 0; i != jewels.size();i++){
            for(int j = 0; j != stones.size();j++){
                if( jewels[i] == stones[j] ){
                    answer++;
                }
            }
        }
        return answer;
    }
};

int main(){
    Solution solution;
    string jewels1 = "aA";
    string stones1 = "aAAbbbb";
    cout << solution.numJewelsInStones(jewels1,stones1) << endl;
    string jewels2 = "z";
    string stones2 = "ZZ";
    cout << solution.numJewelsInStones(jewels2,stones2) << endl;
}