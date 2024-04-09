#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
#include <cmath>

using namespace std;

/*
Maximum Depth of Binary Tree

Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
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
    int maxDepth(TreeNode* root) {
        if (root == nullptr) {
            return 0;
        } else {
            int leftDepth = maxDepth(root->left);
            int rightDepth = maxDepth(root->right);
            return 1 + max(leftDepth, rightDepth);
        }
    }
};
int main(){
    Solution solution;
    TreeNode* q = new TreeNode(9,nullptr,nullptr);
    TreeNode* w = new TreeNode(15);
    TreeNode* l = new TreeNode(7);
    TreeNode* r = new TreeNode(20,w,l);
    TreeNode* root = new TreeNode(3,q,r);
    cout << solution.maxDepth(root) << endl;
}

