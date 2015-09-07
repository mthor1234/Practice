import java.util.Scanner;

// This Class is used to launch different data structure examples
public class Main {

	// Holds the Stack object
	private static Stack stack;
	
	// The main method... Runs the program selection menu
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter '1' to start stack");
		
		int userChoice = reader.nextInt();
		
		if(userChoice == 1){
			stack = new Stack();
			handleStackInput();
		}
		
	}
	
	// Handles the user input if the Stack program is chosen... User can select Push, Pop, Peek, Print, or Quit
	public static void handleStackInput(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Welcome to the 'Stack Experience'...\n "
				+ "Type 'push' to push a number onto the stack... \n"
				+ "Type 'pop' to pop a number off of the stack... \n"
				+ "Type 'peek' to look at the top of the stack....\n"
				+ "Type 'print' to print off the stack.... \n"
				+ "Type 'q' to quit at anytime");
		
		String userChoice = reader.next();
		
		
			while(!userChoice.equalsIgnoreCase("q")){
				
				if(userChoice.equalsIgnoreCase("push")){
					System.out.println("Type a number to push onto the stack ");
					Scanner read = new Scanner(System.in);
					int pushNumber = reader.nextInt();

					stack.push(pushNumber);
				}
				
				else if(userChoice.equalsIgnoreCase("pop")){
					stack.pop();
				}
				
				else if(userChoice.equalsIgnoreCase("peek")){
					stack.peek();
				}
				
				else if(userChoice.equalsIgnoreCase("print")){
					stack.printStack();
				}
				
				else if(userChoice.equalsIgnoreCase("q")){
					break;
				}
				
				else{
				System.out.println("Command not found, try again!");

				}
				
				handleStackInput();
			}
		}
	

}
