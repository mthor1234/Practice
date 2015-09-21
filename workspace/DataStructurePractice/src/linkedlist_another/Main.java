package linkedlist_another;

import java.util.Scanner;

public class Main {
	static LinkedListStack list;

	public static void main(String[] args) {
		
		list = new LinkedListStack();
		handleStackLinkedInput();
		
	}
	
	
	public static void handleStackLinkedInput(){
	Scanner reader = new Scanner(System.in);
	System.out.println("Welcome to the 'Stack Linked List Experience'...\n "
			+ "Type 'push' to push a number onto the stack... \n"
			+ "Type 'pop' to pop a number off of the stack... \n"
			+ "Type 'print' to print off the stack.... \n"
			+ "Type 'q' to quit at anytime");
	
	String userChoice = reader.next();
	
	
		while(!userChoice.equalsIgnoreCase("q")){
			
			if(userChoice.equalsIgnoreCase("push")){
				System.out.println("Type a number to push onto the stack ");
				Scanner read = new Scanner(System.in);
				int pushNumber = reader.nextInt();

				list.push(pushNumber);
			}
			
			else if(userChoice.equalsIgnoreCase("pop")){
				list.pop();
			}
		
			else if(userChoice.equalsIgnoreCase("print")){
				list.print();
			}
			
			else if(userChoice.equalsIgnoreCase("q")){
				break;
			}
			
			else{
			System.out.println("Command not found, try again!");

			}
			
			handleStackLinkedInput();
		}
	}

}
