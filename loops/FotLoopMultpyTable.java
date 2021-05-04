package loops;

import java.util.Scanner;

public class FotLoopMultpyTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tableOf = sc.nextInt();
		for (int a = 1; a <= 10; a = a + 1) {
			int Table = tableOf * a ;
			System.out.println(tableOf + " * " + a + " = " + Table );

		}
// Multiplication Table Using For Loop
	}

}
