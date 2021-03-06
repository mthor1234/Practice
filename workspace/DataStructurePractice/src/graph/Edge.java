package graph;

public class Edge {
	// Represent the two nodes connected by this edge....
	// O--Edge--O
	Node nodeA;
	Node nodeB;
	
	private int weight;
	
	// Constructor... Sets the edge w/ both nodes.... non weighted graph
	public Edge(Node nodeA, Node nodeB){
		this.nodeA = nodeA;
		this.nodeB = nodeB;
	}
	// Constructor... Sets the edge w/ & weight for both nodes.... weighted graph
	public Edge(Node nodeA, Node nodeB, int weight){
		this.nodeA = nodeA;
		this.nodeB = nodeB;
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
