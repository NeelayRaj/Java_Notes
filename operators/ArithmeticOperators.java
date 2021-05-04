package operators;
import java.util.Scanner;

//Notes By Harsh Raj
//instagram @the.harsh.raj
//twitter @the_harsh_raj

public class ArithmeticOperators {

	public static void main(String[] args) {

		Scanner ari = new Scanner(System.in); // function Scanner 
		int a = 23;
		int b = 28;
		int z = ari.nextInt(); //Scanner Defined
		
		int c = a * a + b * b + 2 * a * b;
				int d = (a + b) * (a + b);
				
				System.out.println(c);
				System.out.println(d);
//				addition and multiplication
				
		int e = b / a;
		float f = b / a;
		float g = (float)b / (float)a;
		
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		int h = b % a;
		System.out.println(h);
		
		int i = a++;
		
		System.out.println(i + "  "+ a);
		System.out.println(a);
		System.out.println(i);
		
		int j = a--;
		
	System.out.println(j);
	System.out.println(a +"  "+ j);
	
		int x = z / a;
		System.out.println(x); //Arithmetic Operator With Scanner
	}

}
