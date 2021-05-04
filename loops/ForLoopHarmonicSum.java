package loops;
import java.util.Scanner;

public class ForLoopHarmonicSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float Hsum = 0f;
		
		for (float i = 1; i <= n; i = i + 1) {
			Hsum = Hsum + 1 / i ;
		}
System.out.println("Sum of series is " + Hsum );
	}

}
