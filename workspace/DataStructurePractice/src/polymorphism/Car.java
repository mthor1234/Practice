package polymorphism;

/*
 * This is an example of inheritance and polymorphism....
 * All makes of vehicles will be cars and will inherit all of cars methods/fields.
 */

public class Car {
	private final String engineNoise;
	private String color;
	private String shifter;

	
	// Constructor
	public Car(String engineNoise, String color, String shifter){
		this.engineNoise = engineNoise;
		this.color = color;
		this.shifter = shifter;
	}

	protected void startEngine(){
		System.out.println("Starts car engine: " + engineNoise);
	}
	
	protected void shift(){
		System.out.println("Shifting");
	}

	

}
