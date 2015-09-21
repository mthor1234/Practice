package linkedlist_another;

public class LinkedListStack {

	Node top;
	
//	public LinkedList(int val){
//		top = new Node(val);
//	}
	
	public void push(int val){
		Node pushedNode = new Node(val);
		pushedNode.next = top;
		top = pushedNode;
	}
	
	public Node pop(){
		if(top == null){
			System.out.println("List is Empty!");
			return null;
		}
		else{
			Node n = top;
			top = top.next;
			return n;
		}
	}
	
	public void peek(){
		if(top != null){
			System.out.println("Top is : " + top.val);
		}
		else{
			System.out.println("List is empty!");
		}
	}
	
	public void print(){
		Node currNode = top;
		while(currNode != null){
			System.out.println(currNode.val + "-");
		currNode = currNode.next;

		}
	}
	
	
}
