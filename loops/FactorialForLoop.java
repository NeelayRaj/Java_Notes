package loops;
import java.util.Scanner;
public class FactorialForLoop {

	public static void main(String[] args) {
		
		Scanner fact = new Scanner(System.in);
		int a = fact.nextInt();
		int facto = 1;
		
		for (int i = 1 ; i <= a ; i++ ) {
			  facto = facto * i ;
		}
	System.out.println("factorial of " + a + " is " + facto);
	}

}
