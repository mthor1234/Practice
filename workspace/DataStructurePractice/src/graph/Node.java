package graph;

import java.util.ArrayList;

public class Node {

	private int value;		
	private ArrayList<Edge> edges = new ArrayList<Edge>();
	private boolean visited = false;
	
	public Node(){
	}
	
	public Node(int value){
		this.setValue(value);
	}
	
	public void setEdge(Node connectedNode){
		Edge edge = new Edge(this, connectedNode);
		edges.add(edge);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	
}
