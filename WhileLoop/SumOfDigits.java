package WhileLoop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp = n;
		int sum = 0;
		
		while (temp > 0) {
			
			int LastDig = temp % 10;
			temp /= 10;
			
			sum += LastDig;
			
		}
		System.out.println("Sum of Digit is " + sum);

	}

}
