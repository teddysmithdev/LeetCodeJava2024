package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int levelSize = 0;
        while(!queue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            levelSize = queue.size();
            for(int i = 0; i < levelSize; i++) {
                TreeNode node = queue.remove();
                levelNodes.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            result.add(levelNodes);
        }
        return result;
    }
}
