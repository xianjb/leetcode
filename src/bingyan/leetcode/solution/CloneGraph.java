package bingyan.leetcode.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CloneGraph {
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if(node == null)
			return node;
		
		Set<UndirectedGraphNode> set = new HashSet<UndirectedGraphNode>();
		Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
		
		Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
		queue.add(node);
		for(UndirectedGraphNode n=queue.poll(); n!=null; n=queue.poll()) {
			if(!set.add(n))
				continue;
			
			UndirectedGraphNode nn = map.get(n);
			if(nn == null) {
				nn = new UndirectedGraphNode(n.label);
				map.put(n, nn);
			}
			for(UndirectedGraphNode nnn : n.neighbors) {
				UndirectedGraphNode nnnn = map.get(nnn);
				if(nnnn == null) {
					nnnn = new UndirectedGraphNode(nnn.label);
					map.put(nnn, nnnn);
				}
				nn.neighbors.add(nnnn);
				queue.add(nnn);
			}
		}
		return map.get(node);
	}
}
