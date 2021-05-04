package ifAndElse;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner switchS = new Scanner(System.in);
		
		int dayOfWeek = switchS.nextInt();
		
//		if (dayOfWeek == 1) {
//			
//		}
//		if (dayOfWeek == 2) {
//			
//		}
//		if (dayOfWeek == 3) {
//			
//		}
//		if (dayOfWeek == 4) {
//			
//		}
//		if (dayOfWeek == 5) {
//			
//		}
//		if (dayOfWeek == 6) {
//			
//		}
//		if (dayOfWeek == 7) {
//			
//		}
 
		
		switch (dayOfWeek) {
		case 1 : 
			System.out.println("I am on leave and playing games");
			break;
		case 2 : System.out.println("I am not at home today");
		    break;
		case 3 : System.out.println("Its time to Invest");
		    break;
		case 4 : System.out.println("I am playing with codes");
		    break;
		case 5 : System.out.println("Dont worry today we will research");
		    break;
		case 6 : System.out.println("We are at Day 6 Time to develop some skills");
			break;
		case 7 : System.out.println("Last Day , We have to analys");
			break;
			default : System.out.println("There is 7 day in a week buddy , you have to study in class LKG again");
		}
		// Switch Statement
	}

}
