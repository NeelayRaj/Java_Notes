package operators;
import java.util.Scanner;

//Notes By Harsh Raj
//instagram @the.harsh.raj
//twitter @the_harsh_raj


public class BitwiseOperators {

	public static void main(String[] args) {
  
		Scanner neelay = new Scanner(System.in);
		int a = 5;
		int b = 6;
		int h = neelay.nextInt();
		
		int c = a & b;
		System.out.println(c);
//		AND Function
		
		int d = a | b;
		System.out.println(d);
//		OR Function
		
		int e = b >> 1;
		System.out.println(e);
//        right shift by 1 

		int f = a << 1;
		System.out.println(f);
//		left shift by 1
		
		int g = h << 1;
		System.out.println(h);
		System.out.println(g);
	}

}
