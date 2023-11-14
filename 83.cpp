#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

/*
Remove Duplicates from Sorted List


Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.



*/

 struct ListNode {
     int val;
     ListNode *next;
     ListNode() : val(0), next(nullptr) {}
     ListNode(int x) : val(x), next(nullptr) {}
     ListNode(int x, ListNode *next) : val(x), next(next) {}
};
 
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* aux = head;
        int value = aux->val;
        while(aux != nullptr){
            if( value == aux->next->val ){
                ListNode* auxNew = aux->next; 
                aux->next = nullptr;
                aux = auxNew;
            }
        }
        return aux;
    }
};

void printList(ListNode* cabeza) {
    while (cabeza != nullptr) {
        cout << cabeza->val << " ";
        cabeza = cabeza->next;
        }
        cout << endl;
    }

int main(){
    Solution solution;
    ListNode* nodo1 = new ListNode(1);
    ListNode* nodo2 = new ListNode(1);
    ListNode* nodo3 = new ListNode(2);
    nodo1->next = nodo2;
    nodo2->next = nodo3;
    //ListNode* result = solution.deleteDuplicates(nodo1);
    printList(nodo1);
    delete nodo1;
    delete nodo2;
    delete nodo3;
}

