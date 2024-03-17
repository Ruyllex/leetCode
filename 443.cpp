#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string.h>
#include <unordered_map>
using namespace std;

/*
String Compression


Given an array of characters chars, compress it using the following algorithm:
Begin with an empty string s. For each group of consecutive repeating characters in chars:
If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. 
Note that group lengths that are 10 or longer will be split into multiple characters in chars.
After you are done modifying the input array, return the new length of the array.
You must write an algorithm that uses only constant extra space.
*/


class Solution {
    public:
    int compress(vector<char>& chars) {
        if (chars.size() == 1) {
            return 1;
        }
        char aux = chars[0];
        int count = 1;
        int writeIndex = 0;

        for (int i = 1; i < chars.size(); i++) {
            if (aux == chars[i]) {
                count++;
            } else {
                chars[writeIndex++] = aux;
                if (count > 1) {
                    string countStr = to_string(count);
                    for (char c : countStr) {
                        chars[writeIndex++] = c;
                    }
                }
                aux = chars[i];
                count = 1;
            }
        }

        chars[writeIndex++] = aux;
        if (count > 1) {
            string countStr = to_string(count);
            for (char c : countStr) {
                chars[writeIndex++] = c;
            }
        }
        chars.resize(writeIndex); 
        return writeIndex;
    }
};

int main(){
    Solution solution;
    vector<char> v = {'a','a','b','b','c','c','c'};
    cout << solution.compress(v) << endl;
    vector<char> v1 = {'a'};
    cout << solution.compress(v1) << endl;
    vector<char> v2 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
    cout << solution.compress(v2) << endl;

}