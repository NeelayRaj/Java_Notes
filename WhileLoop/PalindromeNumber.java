package WhileLoop;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0;
		int temp = n;
		while(temp > 0) {
			
			int LastDig = temp % 10;
			temp /= 10;
			r = r * 10 + LastDig;
			
			
		}
		if (r == n) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}

}
