package dijkstra;

public class Edge {
	
	int weight;
	Node leftNode, rightNode;
	
	public Edge(int val, Node left, Node right){
		weight = val;
		leftNode = left;
		rightNode = right;
	}

}
