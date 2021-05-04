package loops;
import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int z = 0;
		 
		 for(int i = 1; i <= n; i++) {
			 for (int j = 1; j <= n - i + 1; j++) {
				 System.out.print(" ");
			 }
			 for (int k = 1; k <= i; k++) {
				 for (int a = 1; ;a++ ) {
					z = a + z;
					break;
				 }
				 System.out.print(z + " ");
			 }
			 for (int l = 1; l <= n - i; l++) {
				 System.out.print(" ");
			 }
			 System.out.println();
		 }

	}

}
