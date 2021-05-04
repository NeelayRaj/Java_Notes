package loops;
import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = a ; i > 0; i--) {
			for (int j = 1; j > 0; j++ ) {
				System.out.print("* ");
				if (j >= i)
					break;
			}
			System.out.println();
		}

	}

}
