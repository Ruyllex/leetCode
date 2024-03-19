#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string>
#include <unordered_set>


using namespace std;


/*
Find the Highest Altitude

There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. 
The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n).
Return the highest altitude of a point.
*/

class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int max_altitude = 0 , aux = 0;
        for(int i = 0; i != gain.size(); i++){
            aux += gain[i];
            if (aux > max_altitude)
                max_altitude = aux;
        }
        return max_altitude;
    }
};

int main(){
    Solution solution;
    vector<int> gain = {-5,1,5,0,-7};
    cout << solution.largestAltitude(gain) << endl;
    vector<int> gain1 = {-4,-3,-2,-1,4,3,2};
    cout << solution.largestAltitude(gain1) << endl;
}