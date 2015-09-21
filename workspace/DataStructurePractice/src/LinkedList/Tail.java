package LinkedList;

public class Tail {
	
	private Pointer pointer = new Pointer();

	public Pointer getPointer() {
		return pointer;
	}

	public void setPointer(Node node) {
		pointer.setNodePointer(node);
	}

}
