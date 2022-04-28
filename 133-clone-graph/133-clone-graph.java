/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        
        // This hashmap contains hm<original Node, cloned Node>
        HashMap<Node, Node> visitedMap = new HashMap<>();
        // BFS -> Queue is used to keep a track of visited nodes of original graph
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        // initially just empty node with original value is inserted
        visitedMap.put(node, new Node(node.val));
        
        while(!queue.isEmpty()){
            Node n = queue.poll();
            
            for(Node neigh : n.neighbors){
                if(!visitedMap.containsKey(neigh)){
                    // initially just empty node with original value is inserted
                    visitedMap.put(neigh, new Node(neigh.val));
                    queue.add(neigh);
                }
                // Update hashmap values which contains cloned node with original node's neigbours.
                visitedMap.get(n).neighbors.add(visitedMap.get(neigh));
            }
        }
        return visitedMap.get(node);

    }
}