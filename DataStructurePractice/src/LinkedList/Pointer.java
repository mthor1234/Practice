package LinkedList;

public class Pointer {
	
	private Node nodePointer;
	
	public Pointer(){
	}
	
	public Pointer(Node node){
		nodePointer = node;
	}

	public Node getNodePointer() {
		return nodePointer;
	}

	public void setNodePointer(Node nodePointer) {
		this.nodePointer = nodePointer;
	}
	

}
