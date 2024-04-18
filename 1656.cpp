#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <string>
#include <unordered_set>

using namespace std;

/*
Design an Ordered Stream


There is a stream of n (idKey, value) pairs arriving in an arbitrary order,
where idKey is an integer between 1 and n and value is a string. No two pairs have the same id.
Design a stream that returns the values in increasing order of their IDs by returning a chunk (list) of values after each insertion.
The concatenation of all the chunks should result in a list of the sorted values.
Implement the OrderedStream class:
OrderedStream(int n) Constructs the stream to take n values.
String[] insert(int idKey, String value) Inserts the pair (idKey, value) into the stream,
then returns the largest possible chunk of currently inserted values that appear next in the order.
*/

class OrderedStream {
public:
    string v[1000];
    int ptr = 0;
    OrderedStream(int n) {
    
    }
    vector<string> insert(int idKey, string value) {
        v[idKey-1]=value;
        vector<string>ans;
        while(v[ptr]!=""){
            ans.push_back(v[ptr]);
            ptr++;
        }
        return ans;
    }
};
void printVector(vector<string> v){
    for(int i = 0; i != v.size();i++){
        cout << v[i];
    }
    cout << endl;
}

int main(){
    OrderedStream* os = new OrderedStream(5);
    vector<string> ans =  os->insert(3, "ccccc"); // Inserts (3, "ccccc"), returns [].
    printVector(ans);
    vector<string> ans1 = os->insert(1, "aaaaa"); // Inserts (1, "aaaaa"), returns ["aaaaa"].
    printVector(ans);
    vector<string> ans2 = os->insert(2, "bbbbb"); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
    printVector(ans2);
    vector<string> ans3 = os->insert(5, "eeeee"); // Inserts (5, "eeeee"), returns [].
    printVector(ans3);
    vector<string> ans4 = os->insert(4, "ddddd"); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
    printVector(ans4);
}