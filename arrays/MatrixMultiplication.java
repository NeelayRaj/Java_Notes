package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Dimension of Matrix A : ");
		
		int cols1 = sc.nextInt();
		int rows1 = sc.nextInt();
		
		int a [][] = new int [rows1][cols1];
		System.out.println("Enter Dimension of Matrix B : ");
		
		int cols2 = sc.nextInt();
		int rows2 = sc.nextInt();
		
		int b [][] = new int [rows2][cols2];
		
		int c [][] = new int [rows2][cols1];
		
		
		if(rows1 == cols2) {
			System.out.println("Enter Value In Matrix A :");
			for (int i = 0; i < rows1; i++) {
				for (int j = 0 ; j < cols1; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter Value in Matrix B :");
			for (int i = 0; i < rows2; i++) {
				for (int j = 0 ; j < cols2; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < rows1; i++) {
				for (int j = 0 ; j < cols2; j++) {
					for (int k = 0; k < cols2; k++) {
						c[i][j] = a[i][k] * b[k][j] + a[i][k]*b[k][j];
					}
				}
			}
			
			for (int i = 0; i < rows1; i++) {
				for (int j = 0 ; j < cols2; j++) {
					System.out.print(c[i][j]);
					
				}
				System.out.println();
			}
			
			
			} else {
			System.out.println("No Of Rows in Matrix A must be Equal to No of column in Matrix B");
		}
		
	}

}
