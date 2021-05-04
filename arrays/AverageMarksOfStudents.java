package arrays;
import java.util.Scanner;
public class AverageMarksOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		
		System.out.println("Enter the marks for average");
		for(int i = 0; i < n; i++ ) {
			marks[i] = sc.nextInt();
		}
		int averageMarks = 0;
		for(int j = 0; j < n; j++) {
			averageMarks += marks[j];
		}
		averageMarks /= n;
		System.out.println("Average mark obtained is " + averageMarks);
	}
 } 