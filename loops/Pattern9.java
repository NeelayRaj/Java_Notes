package loops;
import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("*");
		
		for (int i = 1; i <= n - 2; i++) {
			
			for (int j = 1; j <= 1; j++) {
				System.out.print("* ");
			}
			for (int k = 1; k <= i - 1; k ++) {
				System.out.print("  ");
			}
			for (int l = 1; l <= 1; l++) {
				System.out.print("*");
			}
			System.out.println();
			}
		if (n > 1) {
			for (int m = 1; m <=n ; m++) {
				System.out.print("* ");
			}
		}
	}
}