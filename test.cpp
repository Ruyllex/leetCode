#include <iostream>
#include <vector>
#include <algorithm>
#include <typeinfo>

using namespace std; // Debe estar antes de las demás inclusiones y definiciones

bool comparadorPorLongitud(const string& a, const string& b) {
    return a.length() < b.length();
}

int main() {
    int negativeNumber = -1;
    cout << negativeNumber << endl;
    return 0;
}