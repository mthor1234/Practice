package fibonacci;

public class Fibonacci_Sequence {
	
	int previousNumber = 0;
	
	
	public static int sequence(int n){
		    if(n == 0)
		        return 0;
		    else if(n == 1)
		      return 1;
		   else
		      return sequence(n - 1) + sequence(n - 2);
		}
	
	
	public static void main(String[] args) {
		System.out.println(sequence(8));
	}
	
	
	
	}

	