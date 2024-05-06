#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
#include <cmath>
#include <cctype>
#include <unordered_set>

using namespace std;

/*
Decode the Message

You are given the strings key and message, which represent a cipher key and a secret message, respectively. 
The steps to decode message are as follows:
Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), 
we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message.
*/

string quitarEspacios(const string& cadena) {
    string resultado = cadena;
    resultado.erase(remove_if(resultado.begin(), resultado.end(), [](char c) { return isspace(static_cast<unsigned char>(c)); }), resultado.end());
    return resultado;
}

string quitarLetrasRepetidas(const string& cadena) {
    unordered_set<char> caracteresUnicos;
    string resultado;
    for (char caracter : cadena) {
        if (caracteresUnicos.find(caracter) == caracteresUnicos.end()) {
            caracteresUnicos.insert(caracter);
            resultado += caracter;
        }
    }
    return resultado;
}

class Solution {
public:
    string decodeMessage(const string& key, const string& message) {
        map<char, char> alphabetMap;
        string alphabet = "abcdefghijklmnopqrstuvwxyz"; 
        string keyWithoutSpace = quitarLetrasRepetidas(quitarEspacios(key));
        string ans = "";
        cout << keyWithoutSpace << endl;
        for (int i = 0; i < 27; i++) {
            if (alphabetMap.find(keyWithoutSpace[i]) == alphabetMap.end()) {
                alphabetMap[keyWithoutSpace[i]] = alphabet[i];
            }
        }
        for (int j = 0; j < message.size(); j++) {
            if (message[j] == ' ') {
                ans += ' ';
            } else {
                auto it = alphabetMap.find(message[j]);
                if (it != alphabetMap.end()) {
                    ans += it->second;
                } else {
                }
            }
        }
        return ans;
    }
};

int main(){
    Solution solution;
    string key1 = "eljuxhpwnyrdgtqkviszcfmabo";
    string message1 = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
    cout << solution.decodeMessage(key1,message1) << endl;
    string key2 = "the quick brown fox jumps over the lazy dog";
    string message2 = "vkbs bs t suepuv";
    cout << solution.decodeMessage(key2,message2) << endl;
}