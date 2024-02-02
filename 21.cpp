#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
using namespace std;

/*
Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

*/

struct ListNode {
  int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
 };

void printList(ListNode *head) {
  ListNode *temp = head;
  while (temp != nullptr) {
      cout << temp->val << " ";
      temp = temp->next;
  }
  cout << endl;
}
 
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* head;
        if(list1->val < list2->val){
          head = list1;
        }else{
          head = list2;
        }
        ListNode *temp = head;
        while(temp != nullptr){
          
        }
    }
};


int main() {
    Solution solution; 
    ListNode* node3 = new ListNode(4); 
    ListNode* node2 = new ListNode(2,node3);
    ListNode* node1 = new ListNode(1,node2);
  

    ListNode* node_3 = new ListNode(4); 
    ListNode* node_2 = new ListNode(3,node_3);
    ListNode* node_1 = new ListNode(1,node_2);

    printList(node_1);
    printList(node1);
    //cout << solution.mergeTwoLists(node1,) << endl;   
}
