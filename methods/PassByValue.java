package methods;
class Dog1{
	int legs;
	
}


public class PassByValue {

	public static void main(String[] args) {
		int c = 12;
		int d = 19;
		
		swap(c,d);
		System.out.println(c + " "+ d);
		// value not changed that`s why this is pass by value
		
		Dog1 la = new Dog1();
		Dog1 lb = new Dog1();
		la.legs = 4;
		lb.legs = 3;
		swap(la, lb);
		System.out.println(la.legs + " " + lb.legs);
		// Swap Dog 
		
		Dog1 fb = new Dog1();
		fb.legs = 4;
		changeDog(fb);
		System.out.println(fb.legs);
		// ChangeDog
		
	}
	static void swap(Dog1 da , Dog1 db ) {
		Dog1 temp = da;
		da = db;
		db = temp;
	}
	static void swap(int ca, int cb) {
		int temp = ca;
		ca = cb;
		cb = temp;
	}
	static void changeDog(Dog1 dog) {
		dog.legs = 6;
	}

}

