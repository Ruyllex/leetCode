#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;

/*
Add Binary

Given two binary strings a and b, return their sum as a binary string.
*/

class Solution {
public:
    string addBinary(string a, string b) {
        string result = "";
        int large;
        int largeA = a.size();
        int largeB = b.size();
        if( largeA <= largeB ){
            large = largeB;
        }
        else{
            large = largeA;
        }
        bool sumarUno = false;
        for( int i = large ; i != 0 ; i--){
            if(a[i] == '1' && b[i] == '1'){
                result += '0';
                sumarUno = true;
            }
            if(a[i] == '1' && b[i] == '0'){
                result += '1';
            }
            if(a[i] == '0' && b[i] == '1')
                result += '1';
        }
        return result;
    }
};


int main() {
    Solution solution; 
    string a = "11";
    string b = "1";
    cout << solution.addBinary(a,b);
    string a1 = "1010";
    string b1 = "1011";
    cout << solution.addBinary(a1,b1);
}