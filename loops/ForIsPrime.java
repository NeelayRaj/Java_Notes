package loops;
import java.util.Scanner;

public class ForIsPrime {

	public static void main(String[] args) {
		Scanner Ispr = new Scanner(System.in);
		int x = Ispr.nextInt();
		boolean isPrime = true;
		
		for (int i = 2 ; i < x; i++) {
			if (x % i == 0) {
				isPrime = false;
				break;
				}
		} 
   if (x < 2) isPrime = false; 
   System.out.println(x + " is a prime number " + isPrime);
	}

}