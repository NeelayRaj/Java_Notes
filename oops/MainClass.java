package oops;

class Cat{
	boolean hasFur;
	String color, breed;
	int legs, eyes;
	
	public void walk() {
		System.out.println("Cat is Walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println("this cat has "+ legs + " legs" + " and "+ eyes + " eyes");
		
	}
	
}
class Dog{
	
}

public class MainClass {

	public static void main(String[] args) {
		Cat nick = new Cat();
		Cat meow = new Cat();
		Cat fury = new Cat();
		
		nick.walk();
		nick.breed = "tylor";
		meow.breed = "road side";
		fury.breed = "black";
		System.out.println(meow.breed);
		nick.color = "red";
		meow.color = "purple";
		fury.color = "Space Black";
		nick.legs = 4;
		meow.legs = 3;
		fury.legs = 4;
		nick.eyes = 2;
		meow.eyes = 2;
		fury.eyes = 1;
		nick.hasFur = true;
		meow.hasFur = false;
		fury.hasFur = true;
		
		
		System.out.println(nick.color +" "+ meow.color +" "+ fury.color);
		
		fury.description();
		meow.description();
		nick.description();
	}

}
