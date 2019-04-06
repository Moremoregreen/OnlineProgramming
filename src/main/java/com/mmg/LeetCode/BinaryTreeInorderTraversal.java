package com.mmg.LeetCode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/*
Given a binary tree, return the inorder traversal of its nodes' values.
難度:EASY
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {

        //System.out.println(inorderTraversal());
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }

}
