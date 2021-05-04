package loops;
import java.util.Scanner;

public class ForLoopXPowerY {

	public static void main(String[] args) {
		Scanner XpY = new Scanner(System.in);
		float x = XpY.nextFloat();
		float y = XpY.nextFloat();
		float result = 1.0f;
		
		for (int i = 0; i < y ; i++) {
		result = result * x;
		
		}
		System.out.println(result);
         
	}

}
