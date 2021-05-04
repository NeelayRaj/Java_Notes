package loops;
import java.util.Scanner;

public class ForLoopNaturalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int b = sc.nextInt();
		for (int a = 1; a <= b; a = a + 1) {
			sum = sum + a;
		}
		System.out.println("Sum of first " + b + " Natural number is " + sum);
		
	}
	// Sum of n natural numbers

}
