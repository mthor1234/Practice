package binarytree;

public class BinaryTree {
	
	public Node root = new Node();
	
	
	public void insertNode(Node node, int value){
		// If the value is less than the nodes value
		if(value <= node.getValue()){
			if(node.leftChild != null){
				insertNode(node.leftChild, value);
			}
			else{
				node.leftChild = new Node(value);
				System.out.println("Setting " + value + " as the left child of " + node.getValue());
			}
			
		}
		else if(value > node.getValue()){
			if(node.rightChild != null){
				insertNode(node.rightChild, value);
			}
			else{
				node.rightChild = new Node(value);
				System.out.println("Setting " + value + " as the right child of " + node.getValue());
			}
		}	
	}
	
	
	public Node findNode(Node node, int value){
		if(node.getValue() == value){
			System.out.println("Node: " + node.getValue() + " is found!");
			return node;
		}
		else{
			// If the value is less than the nodes value
			if(value <= node.getValue()){
				if(node.leftChild != null){
					findNode(node.leftChild, value);
				}
				else{
					System.out.println("Node does not exist");
					return null;
				}
				
			}
			else if(value > node.getValue()){
				if(node.rightChild != null){
					findNode(node.rightChild, value);
				}
				else{
					System.out.println("Node does not exist");
					return null;
				}
			}
		}
		return node;
	}
	
	public void inOrderTraversal(Node node){
		if (node != null) {
			  inOrderTraversal(node.leftChild);
		      System.out.println("  Traversed " + node.getValue());
		      inOrderTraversal(node.rightChild);
		    }
	}
	
	public void preOrderTraversal(Node node){
		if (node != null) {
		      System.out.println("  Traversed " + node.getValue());
			  preOrderTraversal(node.leftChild);
			  preOrderTraversal(node.rightChild);
		    }
	}
	
	public void postOrderTraversal(Node node){
		if (node != null) {
			postOrderTraversal(node.leftChild);
			postOrderTraversal(node.rightChild);
		      System.out.println("  Traversed " + node.getValue());

		    }
	}
	
	public Node findMinimum(Node node){
		if(node == null){
			System.out.println("No values on the tree");
		}
		else{
			while(node.leftChild != null){
				node = node.leftChild;
			}
		}
		return node;
		
	}
	
	public Node findMaximum(Node node){
		if(node == null){
			System.out.println("No values on the tree");
		}
		else{
			while(node.rightChild != null){
				node = node.rightChild;
			}
		}
		return node;
		
	}
	

}
