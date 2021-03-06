package bfs_dfs;

import java.util.ArrayList;

public class Vertex {
	
	int id;
	ArrayList<Edge> edges = new ArrayList<Edge>();
	
	public Vertex(int val){
		id = val;
	}
	

	public void addEdge(int val, Vertex v){
		edges.add(new Edge(this, v));
	}
	
	public Vertex checkChildren(){
		Vertex next = null;
		if(edges.size() > 0){
			next = edges.get(0).right;
		
			for(Edge e: edges){
				if(e.right.id < next.id){
					next = e.right;
				}
			}
		}
		return next;
	}
	

}
