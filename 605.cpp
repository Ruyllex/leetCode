#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string.h>
#include <unordered_map>
using namespace std;

/*
Can Place Flowers


You have a long flowerbed in which some of the plots are planted, and some are not. 
However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, 
return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
*/


class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            n--;
        }
        for(int i = 1; i != flowerbed.size(); i++){    
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 ){
                flowerbed[i] = 1;
                n--;
            }
        }
        if(flowerbed[flowerbed.size()] == 0 && flowerbed[flowerbed.size() - 1] == 0){
            n--;
        }
        return n == 0;
    }
};

int main(){
    Solution solution;
    vector<int> flowerbed = {1,0,0,0,1};
    int n = 1;
    cout << solution.canPlaceFlowers(flowerbed,n) << endl;
    vector<int> flowerbed2 = {1,0,0,0,1};
    int n2 = 2;
    cout << solution.canPlaceFlowers(flowerbed2,n2) << endl;
    vector<int> flowerbed3 = {1,0,0,0,0,0,1};
    int n3 = 2;
    cout << solution.canPlaceFlowers(flowerbed3,n3) << endl;
    vector<int> flowerbed4 = {1,0,0,0,1,0,0};
    int n4 = 2;
    cout << solution.canPlaceFlowers(flowerbed4,n4) << endl;
}