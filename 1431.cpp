#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string>


using namespace std;

/*
Kids With the Greatest Number of Candies


There are n kids with candies. You are given an integer array candies, 
where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, 
denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the i^th kid all the extraCandies,
they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.
*/
int Max(vector<int>& nums){
    int max = nums[0];
    for (int i =1 ; i < nums.size() ; i++)
    if (max < nums[i])
        max = nums[i];
    return max;
}

class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool>answer;
        int maxNumberInVector = Max(candies); 
        for(int i = 0;i != candies.size();i++){
            if(candies[i] + extraCandies >= maxNumberInVector){
                answer.push_back(true);
            }
            else{
                answer.push_back(false);
            }
        }
        return answer;
    }
};


void printVector(vector<bool> vec) {
    for(int i = 0; i != vec.size();i++){
        cout << vec[i] << endl;
    }
}

int main(){
    Solution solution;
    vector<int>candies = {2,3,5,1,3};
    int extraCandies = 3;
    printVector(solution.kidsWithCandies(candies, extraCandies));
    vector<int>candies2 = {4,2,1,1,2};
    int extraCandies2 = 1;
    printVector(solution.kidsWithCandies(candies2, extraCandies2));
}

