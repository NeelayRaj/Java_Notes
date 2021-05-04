package WhileLoop;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	int n = sc.nextInt();
	
	int NoOfDig = (int)Math.log10(n) + 1;
	
	System.out.println("No Of Digit is " + NoOfDig);
	}

}
