package org.example;

import java.util.Stack;

public class Solution {
    public TreeNode invertTreeRecursive(TreeNode root) {
        if(root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTreeRecursive(root.left);
        invertTreeRecursive(root.right);

        return root;
    }
    public TreeNode invertTreeIterative(TreeNode root) {
        if(root == null) return null;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();

            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
        return root;
    }
}
