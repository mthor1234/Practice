package dijkstra;

import java.util.ArrayList;

public class Graph {
	
	ArrayList<Node> nodes;
	
	
	public Graph(){
		nodes = new ArrayList<Node>();
	}
	
	public void addNode(Node n){
		nodes.add(n);
	}

}
