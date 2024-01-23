#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string.h>
using namespace std;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.
*/
map<char,int> countCharcters( string word ){
    map<char,int> charactersCounter;
    for(char characters : word){
        charactersCounter[characters]++;
    }
    return charactersCounter;
};

bool everything0(map<char, int>& miMapa) {
    for (const auto& par : miMapa) {
        if (par.second != 0) {
            return false;
        }
    }
    return true;
}


bool check(map<char,int> characterCounter,string t){
    for(char character : t){
        characterCounter[character]--;
    } 
    return everything0(characterCounter);
}



class Solution {
public:
    bool isAnagram(string s, string t) {
        int largeS = s.size();
        int largeT = t.size();
        if(largeS == largeT){
            return check(countCharcters(s), t);
        }
        else{
            return false;
        }
    }
};


int main(){
    Solution solution;

    string s = "anagram";
    string t = "nagaram";

    cout << solution.isAnagram(s,t) << endl;
    
    string s2 = "rat";
    string t2 = "car";

    cout << solution.isAnagram(s2,t2) << endl;
    
}