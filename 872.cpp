#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
#include <cmath>

using namespace std;

/*
Leaf-Similar Trees
Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
Two binary trees are considered leaf-similar if their leaf value sequence is the same.
Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
*/

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 };


class Solution {
public:
void guardarHojas(TreeNode* root, vector<int>& hojas) {
    if (root == nullptr) {
        return;
        }  
    if (root->left == nullptr && root->right == nullptr) {
        hojas.push_back(root->val);
        }
        guardarHojas(root->left, hojas);
        guardarHojas(root->right, hojas);
        }
    vector<int> listLeaf(TreeNode* root) {
        vector<int> hojas;
        guardarHojas(root, hojas);
        return hojas;
    }
    bool compareList(const vector<int>& lista1, const vector<int>& lista2) {
    if (lista1.size() != lista2.size()) {
        return false;
    }
    for (size_t i = 0; i < lista1.size(); ++i) {
        if (lista1[i] != lista2[i]) {
            return false;
        }
    }
    return true;
}
    bool leafSimilar(TreeNode* root1, TreeNode* root2) {
        vector<int> ListRoot1 = listLeaf(root1);
        vector<int> ListRoot2 = listLeaf(root2);
        return compareList(ListRoot1,ListRoot2);
    }   
};

int main(){
    Solution solution;
    TreeNode* root1 = new TreeNode(3);
    root1->left = new TreeNode(5);
    root1->right = new TreeNode(1);
    root1->left->left = new TreeNode(6);
    root1->left->right = new TreeNode(2);
    root1->left->right->left = new TreeNode(7);
    root1->left->right->right = new TreeNode(4);
    root1->right->left = new TreeNode(9);
    root1->right->right = new TreeNode(8);

    TreeNode* root2 = new TreeNode(3);
    root2->left = new TreeNode(5);
    root2->right = new TreeNode(1);
    root2->left->left = new TreeNode(6);
    root2->left->right = new TreeNode(7);
    root2->right->left = new TreeNode(4);
    root2->right->right = new TreeNode(2);
    root2->right->right->right = new TreeNode(8);
    root2->right->right->left = new TreeNode(9);
    cout << solution.leafSimilar(root1,root2) << endl;
}
