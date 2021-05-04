package learningScanners;
import java.util.Scanner;
public class LearningScanners {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		float si = principal * rate * time ;
		
		System.out.println("Simple Interest is" + si );

	}

}
