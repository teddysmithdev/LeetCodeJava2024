package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Node curr = new Node(node.val);
        map.put(node, curr);
        for(Node nei : node.neighbors) {
            if(!map.containsKey(nei)) cloneGraph(nei);
            curr.neighbors.add(map.get(nei));
        }
        return curr;
    }
}
