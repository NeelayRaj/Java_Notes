package methods;

public class Intro {

	public static void main(String[] args) {
		int i = 34;
		int j = 69;
		int result = ofMax(i, j);
		System.out.println(result);
		sayHi();
	}
	
	static int ofMax(int a, int b) {
//		if (a>b) {
//			return a;
//		}else {
//			return b;
//		}
		return a > b ? a : b;
		
	}
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning");
	}

}
