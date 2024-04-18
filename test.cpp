#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cctype>
#include <map>

using namespace std;


struct comparadorAlfabetico {
    bool operator()(char a, char b) const {
        return a < b;
    }
};



template <typename KeyType, typename ValueType>
char todosValoresIguales(const map<KeyType, ValueType,comparadorAlfabetico>& mapa1, const map<KeyType, ValueType,comparadorAlfabetico>& mapa2) {
    for (const auto& par : mapa1) {
        auto it = mapa2.find(par.first);
        if (it == mapa2.end() || it->second != par.second) {
            return par.first;
        }
    }
}

map<char,int,comparadorAlfabetico> fillMap(string s){
    map<char,int,comparadorAlfabetico> MAP;
    for(int i = 0; i != s.size();i++){
        if(!MAP[s[i]]){
            MAP[s[i]] = 0;
        }
        else{
            MAP[s[i]]++;
        }
    }
}

template<typename KeyType, typename ValueType>
void imprimirMapa(const map<KeyType, ValueType,comparadorAlfabetico>& mapa) {
    for (const auto& par : mapa) {
        cout << par.first << ": " << par.second << endl;
    }
}
int main() {
    string x = "wodweddwdwvrtvboh";
    map<char,int,comparadorAlfabetico> MAP = fillMap(x);
    imprimirMapa(MAP);
    return 0;
}