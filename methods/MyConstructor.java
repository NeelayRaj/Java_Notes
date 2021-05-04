package methods;

class Dog{
	int legs;
	Dog(){
		legs = 4;
	} // non parameterized constructor
}

class Vehicles{
	int wheels;
	String color;
	Vehicles(int wheels){
		this.wheels = wheels;
	} // Parameterized constructor
	
	Vehicles(int wheels , String color){
		this.wheels = wheels;
		this.color = color;
	}
	//Constructor Overloading
}
public class MyConstructor {
	MyConstructor(){
		System.out.println("Object is already created");
	}
		
	public static void main(String[] args) {
		MyConstructor jon = new MyConstructor();
		
		Dog kalu = new Dog();
		System.out.println(kalu.legs);
		
		Vehicles car = new Vehicles(4);
		Vehicles scooty = new Vehicles(2);
		
		Vehicles eRicksaw = new Vehicles(3 , "Yellow");
		
		System.out.println(car.wheels);
		System.out.println(scooty.wheels);
		System.out.println(eRicksaw.color + " " + eRicksaw.wheels);
		
	}

}
