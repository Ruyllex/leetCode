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
    string ans;
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry) {
      if (i >= 0)
        carry += a[i--] - '0';
      if (j >= 0)
        carry += b[j--] - '0';
      ans += carry % 2 + '0';
      carry /= 2;
    }

    reverse(begin(ans), end(ans));
    return ans;
  }
};

int main() {
    Solution solution; 
    string a = "11";
    string b = "1";
    cout << solution.addBinary(a,b) << endl;
    string a1 = "1010";
    string b1 = "1011";
    cout << solution.addBinary(a1,b1) << endl;
}