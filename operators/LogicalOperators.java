package operators;
import java.util.Scanner;  // Scanner Imported
public class LogicalOperators {

	public static void main(String[] args) {
		Scanner LogOp = new Scanner(System.in); // Defined LogOp As Scanner User Input
		
		int a = LogOp.nextInt();
		
		if (a >= 1 && a <= 100) {
			System.out.println("Number is in Range of 1 and 100");
		}
		else {
			System.out.println("Number is not in range");
		}
// AND logical operator
		int grade = LogOp.nextInt();
		
		if (grade == 10 || grade == 12) {
			System.out.println("you can appear in board exams this academic year");
		}
		else {
			System.out.println("You Cannot appear in board Exams this academic year");
		}
// OR logical Operator
		int AVGkill = LogOp.nextInt();
		
		if (!(AVGkill >= 30)) {
			System.out.println("You Are NOT qualified for Tier 2 ");
		}
		else System.out.println("You are Qualified For Tier 2");
	}
// NOT Operators	

}
