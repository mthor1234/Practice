package a_star;

public class Main {
	
	static Node startNode, endNode;

	public static void main(String[] args) {
		startNode = new Node();
		endNode = new Node();
		
		Grid g = new Grid(startNode, endNode);
		
		g.generateGrid();
		g.a_Star(g.startNode);

	}

}
