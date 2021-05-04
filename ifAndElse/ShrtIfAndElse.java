package ifAndElse;
import java.util.Scanner; // import Scanner

public class ShrtIfAndElse {

	public static void main(String[] args) {
		Scanner shrt = new Scanner(System.in); // Scanner Defined
		
		int a = shrt.nextInt();
		int b = shrt.nextInt();
		
		int MaxOfBoth = 0;
		MaxOfBoth = a > b ? a : b;
		System.out.println("Max of both number is " +  MaxOfBoth);
	}
// Short Hand for If and Else
}
