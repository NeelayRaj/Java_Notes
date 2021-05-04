package ifAndElse;
import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner Nested = new Scanner(System.in);
		
		int a = Nested.nextInt();
		int b = Nested.nextInt();
		int c = Nested.nextInt();
		
		if (a > b) {
			if (a > c) {System.out.println(a + " is Greatest number Among Three");
				}
			else {System.out.println(c + " is Greatest number Among Three ");
				}
		}
		else { if (b > c) { System.out.println(b + " is Greatest number Among Three");
			
		} else { System.out.println(c + " is Greatest number Among Three");
			
        }
			
		}
		
		}
// Nested If else	
// You Can Use Any No of If , else , Else if Statement with use of nested if else
}
