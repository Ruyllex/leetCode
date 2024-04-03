#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
#include <cmath>

using namespace std;

/*
Unique Number of Occurrences

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
*/

class Solution {
    public:
        bool checkMap(map<int,int> mapa, int x){ 
            for(auto const& y : mapa){
                if(x == y.first){
                    return true;
                }
            }
            return false;

        }
        bool sonTodosDistintos( vector<int>& v) {            
            sort(v.begin(), v.end()); 
            for (size_t i = 1; i < v.size(); ++i) {
                if (v[i] == v[i - 1]) {
                    return false; 
                }
            }
            return true;             
        }
        bool uniqueOccurrences(vector<int>& arr) {
            map<int,int> mapa;
            vector<int> aux;
            for(int i = 0; i != arr.size();i++){
                if(!checkMap(mapa,arr[i])){
                    mapa[arr[i]] = 1;
                }
                else{
                    mapa[arr[i]]++;
                }
            }

            for(auto const& z : mapa){
                aux.push_back(z.second);
            }
            return sonTodosDistintos(aux);
        }
    };



int main(){
    Solution solution;
    vector<int> arr = {1,2,2,1,1,3};
    cout << solution.uniqueOccurrences(arr) << endl;
    vector<int> arr1 = {1,2};
    cout << solution.uniqueOccurrences(arr1) << endl;
    vector<int> arr2 = {1,-3,0,1,-3,1,1,1,-3,10,0};
    cout << solution.uniqueOccurrences(arr2) << endl;
}