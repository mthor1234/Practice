package polymorphism;

public class Volkswagon extends Car{
	
	private String engineNoise = "Bang!";
	

	public Volkswagon() {
		super("Cough...Cough....Weeeez.... BANG!.... chug-a-chug-a-chugh-a....BANG!", "Rust", "Automatic");

	}
	
	protected void shift(){
		System.out.println("Wrenching gear into 3... Gear is stuck!");
	}
	
	

}
