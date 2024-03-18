#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string>
#include <unordered_set>


using namespace std;



/*
Maximum Number of Vowels in a Substring of Given Length

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
*/

class Solution {
    private:        
        bool isVowel(char c) { return (c == 'a' || c=='e'|| c=='i'|| c=='o'|| c=='u'); } 
    public:
    int maxVowels(string s, int k) {
        int count = 0, mcount = 0;
        for(int i=0;i<k;i++){
            if(isVowel(s[i])){
                count++;
                if(count == k){
                    return k;
                }
            }
        }
        mcount = max(mcount,count);
        for(int j=k;j !=s.size();j++){
            if(isVowel(s[j])){
                count++;
            }
            if(isVowel(s[j-k])){
                count--;
            }
            mcount = max(count,mcount);
        }
        return mcount;
    }
};


int main(){
    Solution solution;
    string s = "abciiidef";
    int k = 3;
    cout << solution.maxVowels(s,k) << endl;
    string s1 = "aeiou";
    int k1 = 2;
    cout << solution.maxVowels(s1,k1) << endl;
    string s2 = "leetcode";
    int k2 = 3;
    cout << solution.maxVowels(s2,k2) << endl;
}