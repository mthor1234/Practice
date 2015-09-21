package LinkedList;

public class StackLinkedList {

	Pointer top = new Pointer(null);

	// Pushing a Node onto the LinkedList... Creates a new Node and assigns the
	// User's number to the Head
	public void push(int userNumber) {

		// If the Top is null, meaning nothing is currently on the Linked List
		// Then set the Top to point to this new Node
		if (top.getNodePointer() == null) {
			Node tempNode = new Node(userNumber);
			top.setNodePointer(tempNode);
		}

		// Otherwise, there are Nodes on the Linked List so set the new node to
		// point to the old node
		// and update the top to point to the new Node
		else {
			Node tempNode = new Node(userNumber);
			tempNode.setPointer(top.getNodePointer());
			top.setNodePointer(tempNode);
		}

		System.out.println("Pushing on: " + userNumber);

	}

	public void pop() {

		if (top.getNodePointer() != null) {
			Node deletingNode = top.getNodePointer();

			top.setNodePointer(deletingNode.getNextNode());

			System.out.println("Poppping Off: "
					+ deletingNode.getHead().getNumber());
			deletingNode = null;

		}

		else {
			System.out.println("Stack is already empty!");
		}

	}

	public void find(int userNumber) {

		Node curNode = top.getNodePointer();
		int i = 0;
		while (curNode != null) {

			if (curNode.getNextNode().getHead().getNumber() == userNumber) {
				System.out.println("Number found at spot: " + i);
				break;
			} else {
				curNode = curNode.getNextNode();

			}
			i++;
		}

	}

	public void print() {
		Node curNode = top.getNodePointer();

		while (curNode != null) {
			System.out.print("[ " + curNode.getHead().getNumber()
					+ " | x ]--->");

			if (curNode.getNextNode() == null) {
				curNode = null;
			} else {
				curNode = curNode.getNextNode();
			}
		}
	}

}
