package dijkstra;

public class Main {
	
	static Graph g = new Graph();
	static Dijkstra dijkstra;

	public static void main(String[] args) {
		
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");


		nodeA.addEdge(3, nodeB);
		nodeB.addEdge(3, nodeA);

		nodeA.addEdge(5, nodeC);
		nodeC.addEdge(5, nodeA);

		nodeB.addEdge(2, nodeD);
		nodeD.addEdge(2, nodeB);
		
		nodeC.addEdge(1, nodeD);
		nodeD.addEdge(1, nodeC);
		
		nodeD.addEdge(8, nodeE);
		nodeE.addEdge(8, nodeD);


		nodeD.addEdge(2, nodeF);
		nodeF.addEdge(2, nodeD);

		nodeE.addEdge(4, nodeF);
		nodeF.addEdge(4, nodeE);
		
		g.addNode(nodeA);
		g.addNode(nodeB);
		g.addNode(nodeC);
		g.addNode(nodeD);
		g.addNode(nodeE);
		g.addNode(nodeF);


		dijkstra = new Dijkstra(nodeA, nodeF, g);
		dijkstra.search();

		

	}

}
