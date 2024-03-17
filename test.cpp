#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;

#include <iostream>
#include <vector>
#include <string>

using namespace std;

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

    chars.resize(writeIndex); // Redimensionar el vector para eliminar los caracteres adicionales

    return writeIndex;
}

int main() {
    vector<char> chars = {'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c'};
    cout << "Longitud comprimida: " << compress(chars) << endl;
    for (char c : chars) {
        cout << c << " ";
    }
    cout << endl;
    return 0;
}