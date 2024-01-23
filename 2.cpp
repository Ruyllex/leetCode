#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;
/*
Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. 
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
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
    int addDigitToRight(int existingNumber, int digit) {
        return existingNumber * 10 + digit;
    }

    ListNode* createLinkedListFromNumber(int num) {
        ListNode* head = nullptr;
        ListNode* current = nullptr;

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


    int TransformToNumber(ListNode* l){
        int result = 0;
        ListNode* current = l;
        while(current){
            result = addDigitToRight(result,current->val);
            current = current->next;
        }
        return result;
    }


    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int final_sum = TransformToNumber(l1) + TransformToNumber(l2); 
        return createLinkedListFromNumber(final_sum);
    }
};

int main() {
    Solution solution; 
    ListNode* l1 = new ListNode(9);
    ListNode* l2 = new ListNode(9, l1);
    ListNode* l3 = new ListNode(9, l2);
    ListNode* l4 = new ListNode(9, l3);
    ListNode* l5 = new ListNode(9, l4);
    ListNode* l6 = new ListNode(9, l5);
    ListNode* l7 = new ListNode(9, l6);


    ListNode* r1 = new ListNode(9);
    ListNode* r2 = new ListNode(9, r1);
    ListNode* r3 = new ListNode(9, r2);
    ListNode* r4 = new ListNode(9, r3);

    solution.addTwoNumbers(l7,r4);


    }