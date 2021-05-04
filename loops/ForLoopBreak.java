package loops;
import java.util.Scanner;
public class ForLoopBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (; ;) {
			int a = sc.nextInt();
			if (a < 0) {
				System.out.println("Alright! Number is Negative");
				break;
			}
			else {
				System.out.println("Try Again Number is positive");
			}
		}

	}

}
