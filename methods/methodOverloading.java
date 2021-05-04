package methods;

public class methodOverloading {
	
	
	public static void main(String[] args) {
		
		int i = 15;
		int j = 20 ;
		int k = 25;
		float l = (float)25.80;
		float m = (float)28.89;
		
		int what = maxOf(i, j ,k);
		int luck = maxOf(i, j);
		float goo = maxOf(l, m);
		System.out.println(what);
		System.out.println(goo);
		System.out.println(luck);
		
	}
	
	static int maxOf(int a , int b) {
		return a > b ? a : b;
	}
	static int maxOf(int a, int b, int c) {
		return a > b ? a > c ? a : c : b > c ? b : c;
	}
	static float maxOf(float a, float b) {
		return a > b ? a : b;
	}

}
