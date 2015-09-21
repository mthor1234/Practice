package binaryheap_another;

public class Node {
	
	int val;
	boolean goLeft = true;
	
	Node leftChild;
	Node rightChild;
	
	public Node(int val){
		this.val = val;
	}
	
	public void toggleGoLeft(){
		if(goLeft == true){
			goLeft = false;
		}
		
		else if(goLeft == false){
			goLeft = true;
		}
	}

}
