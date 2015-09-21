package binaryheap_another;

public class Heap {
	Node root;
	
	public Heap(int val){
		root = new Node(val);
	}
	
	public void insert(Node n, int val){
		if(n == null){
			n = new Node(val);
			return;
		}
		
		if(val < n.val){
			int updatedVal = n.val;
			n.val = val;
			if(n.goLeft){
				n.toggleGoLeft();
				
				insert(n.leftChild, updatedVal);
			}
			else{
				n.toggleGoLeft();
				insert(n.rightChild, updatedVal);
			}
		}
		
		else{
			if(n.goLeft){
				n.toggleGoLeft();
				insert(n.leftChild, val);
			}
			else{
				n.toggleGoLeft();
				insert(n.rightChild, val);
			}
		}
		
	}
	
	public void preOrderTraversal(Node n){
		if(n == null){
			return;
		}
		System.out.println(n.val);
		preOrderTraversal(n.leftChild);
		preOrderTraversal(n.rightChild);

	}
	
	public void postOrderTraversal(Node n){
		if(n == null){
			return;
		}
		preOrderTraversal(n.leftChild);
		preOrderTraversal(n.rightChild);
		System.out.println(n.val);
	}
	
	public void inOrderTraversal(Node n){
		if(n == null){
			return;
		}
		preOrderTraversal(n.leftChild);
		System.out.println(n.val);
		preOrderTraversal(n.rightChild);
	}


}
