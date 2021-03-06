
public class Stack {
	
	// Holds the top of the stack
	int top_pointer = 0;
	
	// Initialize an integer array to be used as the stack.. Currently has 20 spots
	int[] stack = new int[20];
	
	
	// Push an item onto the stack as long as the top is less than 20
	public void push(int number){
		if(top_pointer <= 20){
			stack[top_pointer] = number;
			top_pointer++;
		}
	}
	
	// Pop an item off of the stack
	public void pop(){
		if(top_pointer > 0){
		top_pointer--;
		}
	}
	
	public void peek(){
		System.out.println("Top of the stack is: " + stack[top_pointer]);
	}
	
	public void printStack(){
		for(int i = 0; i < stack.length; i++){
			System.out.print("[ " + stack[i] + " ]");
		}
	}
	

}
