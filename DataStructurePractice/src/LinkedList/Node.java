package LinkedList;

public class Node {
	
	private Head head = new Head();
	private Tail tail = new Tail();
	
	public Node(int number){
		head.setNumber(number);
	}
	
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public Tail getTail() {
		return tail;
	}
	public void setTail(Tail tail) {
		this.tail = tail;
	}
	
	public Node getNextNode(){
		return tail.getPointer().getNodePointer();
	}
	
	public void setPointer(Node node){
		tail.setPointer(node);
	}
	
	public int getNumber(){
		return head.getNumber();
	}
	

}
