package binaryheap;

import binaryheap.Node;


/*
 * Binary Heap is a Binary Tree with the following specifications:
 * 1) ItÕs a complete tree (All levels are completely filled except 
 * possibly the last level and the last level has all keys as left as possible). 
 * This property of Binary Heap makes them suitable to be stored in an array.
 
 * 2) A Binary Heap is either Min Heap or Max Heap. In a Min Binary Heap, the key
 *  at root must be minimum among all keys present in Binary Heap. The same property
 *  must be recursively true for all nodes in Binary Tree. Max Binary Heap is similar to Min Heap.
 */


public class BinaryHeap {
	public Node root = new Node();
	
	
	public void setRoot(int value){
		root.setValue(value);
	}
	
	// This is the standard binary search tree insert... Need to change it up to fit with BinaryHeap specs
	public void insert(Node node, int value){
		
		// If the vale is greater than the previous node, then it needs to move down to the next level
		if(value >= node.getValue()){
			
			if(node.leftChild == null){
				node.leftChild = new Node(value);
				System.out.println("Inserting: " + value + " as left child of " + node.getValue());
			}
			else if(node.rightChild == null){
				node.rightChild = new Node(value);
				System.out.println("Inserting: " + value + " as right child of " + node.getValue());

			}
			// Need to add an if statement checking if the left child has both spots complete, if so, then we check the right child
			// If both spots are complete... If so, then we add to the left.... If a node is not complete, add to that node, left gets it by default
			else if(node.leftChild != null && node.rightChild != null){
				
				if(node.leftChild.checkForChildOpenings() == false){
					insert(node.leftChild, value);
				}
	
				else if(node.rightChild.checkForChildOpenings() == false){
					insert(node.rightChild, value);
				}
				else{
					insert(node.leftChild, value);
				}
			}
		}
		// Otherwise, the value is greater than the node and it needs to exchange places
		// Can probably use recursion for this
		else{
			int replacedNodeValue = node.getValue();
			node.setValue(value);
			
			insert(node, replacedNodeValue);

		}
			
	}
	
	public void preOrderTraversal(Node node){
		if (node != null) {
		      System.out.println("  Traversed " + node.getValue());
		      preOrderTraversal(node.leftChild);
		      preOrderTraversal(node.rightChild);
		    }
	}
	
	
	public void bubbleUp(Node node){
		
	}

}
