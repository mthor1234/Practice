package binaryheap_another;

public class Main {
	
	static Heap heap = new Heap(10);

	public static void main(String[] args) {
		
		
		
		heap.insert(heap.root, 11);
		heap.preOrderTraversal(heap.root);
	}

}
