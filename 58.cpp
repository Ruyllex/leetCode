#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;

/*
Length of Last Word
Given a string s consisting of words and spaces, 
return the length of the last word in the string.

A word is a maximal
substring
consisting of non-space characters only.
*/
class Solution {
public:
    int lengthOfLastWord(string s) {
        int counter = 0;
        int aux = 0;
        for(int i = s.size() - 1;i >= 0; i--){
            if(s[i] != ' '){
                counter++;
            }
            if((counter > 0) && (s[i] == ' ')){
                return counter;
            }
        }   
        if(counter == 1 || counter == 0){
            return 1;
        }
        return counter;
    }
};

int main() {
Solution solution; 
string s = " Hello World";
int answer = solution.lengthOfLastWord(s);
cout << "output: " << answer << endl; 
string s1 = "  fly me   to   the moon  ";
int answer1 = solution.lengthOfLastWord(s1);
cout << "output: " << answer1 << endl;
string s2 = "luffy is still joyboy";
int answer2 = solution.lengthOfLastWord(s2);
cout << "output: " << answer2 << endl;
string s3 = " a";
int answer3 = solution.lengthOfLastWord(s3);
cout << "output: " << answer3 << endl;
string s4 = "a";
int answer4 = solution.lengthOfLastWord(s4);
cout << "output: " << answer4 << endl;
string s5 = "a ";
int answer5 = solution.lengthOfLastWord(s5);
cout << "output: " << answer5 << endl;
string s6 = "day    ";
int answer6 = solution.lengthOfLastWord(s6);
cout << "output: " << answer6 << endl;
}