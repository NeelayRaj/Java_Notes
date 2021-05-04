package ifAndElse;
import java.util.Scanner;
//Notes By Harsh Raj
//instagram @the.harsh.raj
//twitter @the_harsh_raj

public class ElseIf {

	public static void main(String[] args) {
		Scanner elseif = new Scanner(System.in); // Scanner for User Input
		int hrj = elseif.nextInt();
		
		if (hrj > 0  && hrj < 10) { System.out.println("Number is greater than 0 and less than 10");
			}
		else if (hrj > 10 && hrj < 20) { System.out.println("Number is greater than 10 and less than 20");
			}
		else {System.out.println("Number is Not in range"); 
			}
		// Else If Statemet
	}

}
