package loops;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= a; j++ ) {
					System.out.print("* ");
					if (j >= i)
						break;
				}
				System.out.println();	
		}
		
	}

}
