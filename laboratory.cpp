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
    ListNode* next;
    ListNode(int x) : val(x), next(nullptr) {}
};
 
class Solution {
public:
ListNode* createLinkedListFromNumber(int num) {
    ListNode* head = nullptr;
    ListNode* current = nullptr;

    // Manejar el caso especial para el número 0
    if (num == 0) {
        return new ListNode(0);
    }

    while (num != 0) {
        int digit = num % 10;
        ListNode* newNode = new ListNode(digit);

        if (head == nullptr) {
            head = newNode;
            current = head;
        } else {
            current->next = newNode;
            current = newNode;
        }

        num /= 10;
    }

    return head;
}

void printLinkedList(ListNode* head) {
    while (head) {
        std::cout << head->val << " ";
        head = head->next;
    }
    std::cout << std::endl;
}
};

int main() {
    int number = 12345;
    Solution solution;

    // Crear lista enlazada a partir del número
    ListNode* linkedList = solution.createLinkedListFromNumber(number);
    
    // Imprimir la lista enlazada
    solution.printLinkedList(linkedList);

    return 0;
}


