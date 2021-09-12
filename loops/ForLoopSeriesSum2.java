package loops;
import java.util.Scanner;

public class ForLoopSeriesSum2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	float sum = 0;
	float sum1 = 0;
	float sum2 = 0;
	for (float i=1; i <= n; i = i + 2) {
		sum1 += 1 / i; //Harmonic Sum Of Odd Number
	}
	for (float j = 2; j <= n; j = j + 2) {
		sum2 -= 1 / j; //Harmonic Sum of Negative Even Number
	}
	sum = sum1 + sum2;
	System.out.println("Sum of series is " + sum);
	}

}
