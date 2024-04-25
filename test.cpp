#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cctype>
#include <map>

using namespace std;

int tribonacci(int n) {
    if (n == 0)
        return 0;
    if (n == 1 || n == 2)
        return 1;
    return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
}

int main() {
    cout << tribonacci(6);
}