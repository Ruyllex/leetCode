#include <iostream>
#include <vector>
#include <algorithm>
#include <typeinfo>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
 };

ListNode* crearListaDesdeArreglo(vector<int>& valores) {
    if (valores.empty()) {
        return nullptr; 
    }

    ListNode *head = new ListNode(valores[0]);
    ListNode *actual = head;

    for (int i = 1; i < valores.size(); i++) {
        actual->next = new ListNode(valores[i]);
        actual = actual->next;
    }

    return head;
}
void deleteList(ListNode* head){
    ListNode* actual = head;
    while (actual != nullptr) {
        ListNode *temp = actual;
        actual = actual->next;
        delete temp;
    }
}


void printListNode(ListNode* head){
    ListNode* aux = head;
    while(aux != nullptr){
        cout << aux->val << endl;
        aux = aux->next;
    }
}

class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
ListNode* result = nullptr; 
ListNode* tail = nullptr;  
ListNode* aux1 = list1;
ListNode* aux2 = list2;
while (aux1 != nullptr && aux2 != nullptr) {
    if (aux1->val > aux2->val) {
        if (result == nullptr) {
            result = new ListNode(aux2->val);
            tail = result;
        } else {
            tail->next = new ListNode(aux2->val);
            tail = tail->next;
        }
        aux2 = aux2->next;
    } else {
        if (result == nullptr) {
            result = new ListNode(aux1->val);
            tail = result;
        } else {
            tail->next = new ListNode(aux1->val);
            tail = tail->next;
        }
        aux1 = aux1->next;
    }
}
while (aux1 != nullptr) {
    tail->next = new ListNode(aux1->val);
    tail = tail->next;
    aux1 = aux1->next;
}

while (aux2 != nullptr) {
    tail->next = new ListNode(aux2->val);
    tail = tail->next;
    aux2 = aux2->next;
        }

        return result;
    }
};


int main() {
    Solution solution;
    vector<int> listNumbers1 = {1,2,4};
    vector<int> listNumbers2 = {1,3,4};
    ListNode* list1 = crearListaDesdeArreglo(listNumbers1);
    ListNode* list2 = crearListaDesdeArreglo(listNumbers2);
    ListNode* result = solution.mergeTwoLists(list1,list2);
    printListNode(result);
    deleteList(result);
    deleteList(list1);
    deleteList(list2);

    return 0;
}