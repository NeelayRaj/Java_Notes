package ifAndElse;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		float a = (float)sc.nextFloat();
		System.out.println("Enter Second Number");
		float b = (float)sc.nextFloat();
		System.out.println("Enter Operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		float result = 0f;
		
		switch (operation) {
		case '+' : result = a + b ;
		break;
		case '-' : result = a - b ;
		break;
		case '*' : result = a * b ;
		break;
		case '/' : result = a / b ;
		break;
		default: System.out.println("Invalid operation");
		}
		System.out.println( a + " " + operation + " " + b + " = " + result);
	}
// Caclulator for Addition Substraction Multiplication and Division
	// By Using Switch Statement
}
