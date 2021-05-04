package operators;
import java.util.Scanner;

//Notes By Harsh Raj
//instagram @the.harsh.raj
//twitter @the_harsh_raj

public class AssignOperators {

	public static void main(String[] args) {
	Scanner scnew = new Scanner(System.in); //define scanner function
	
		int a = 7;
		int b = 8;
		int c = 9;
		int d = 10;
		int e = scnew.nextInt(); // User Input
		
		a += 2; // a = a + 2 
		b -= 3; // b = b - 3
		c *= 2; // c = c * 3
		d /= 5; // d = d / 4
		e += 4; // with scanner
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		

	}

}
