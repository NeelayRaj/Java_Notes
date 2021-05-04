package loops;
import java.util.Scanner;

public class ForLoopFibonacciNum {

	public static void main(String[] args) {
		Scanner Fibonacci = new Scanner(System.in);
		int a = Fibonacci.nextInt();
		int b = 0;
		int c = 1;
		System.out.print(b + " ");
		System.out.print(c + " ");
		
		for (int i = 1; i <= a - 2; i++ ) {
			int d = b + c;
			System.out.print(d + " ");
			b = c;
			c = d;
		}
	}

}
