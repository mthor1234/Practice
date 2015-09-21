package polymorphism;

import java.util.ArrayList;

public class InheritanceTest {

	public static void main(String[] args) {
		
		ArrayList<Car> cars = new ArrayList<Car>();
		Car corvette = new Corvette();
		Car volkswagon = new Volkswagon();

		
		
		cars.add(volkswagon);
		
		
		
		for(int i = 0; i < cars.size(); i++){
			cars.get(i).startEngine();
		}
		
		
		corvette.shift();
		volkswagon.shift();
		
	}

}
