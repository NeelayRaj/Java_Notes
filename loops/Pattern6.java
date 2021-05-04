package loops;
import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n - a; b++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= a; c++) {
				System.out.print("* ");
			}
			for (int d = 1; d <= n - a; d++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
