import static org.junit.Assert.assertEquals;

import org.junit.Test;
/*
Search in a Binary Search Tree

You are given the root of a binary search tree (BST) and an integer val.
Find the node in the BST that the node's value equals val and return the subtree rooted with that node. 
If such a node does not exist, return null.
*/


public class $700 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
            }
        }
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null; 
        }
        if(root.val == val){
            return root;
        }
        if (val < root.val) {
            return searchBST(root.left, val); 
        } else {
            return searchBST(root.right, val);  
        }
    }
    @Test
    public void testSearchBST(){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 2;
        assertEquals(val, searchBST(root, val).val);

    }
}
