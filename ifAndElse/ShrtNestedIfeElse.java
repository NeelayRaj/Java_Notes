package ifAndElse;
import java.util.Scanner;

public class ShrtNestedIfeElse {

	public static void main(String[] args) {
		Scanner ShrtNested = new Scanner(System.in);
		int a = ShrtNested.nextInt() , b = ShrtNested.nextInt() , c = ShrtNested.nextInt();
		
		int high = 0;
		
		high = a > b ? a > c ? a : c : b > c ? b : c ;
		System.out.println(high + " is greatest number among these three");

	}
// ShortCut for Nested if Else	
}
