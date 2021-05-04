package arrays;

import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dimension Of Matrix");
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		int a [] [] = new int[row][column];
		int b [] [] = new int[row][column];
		int c [] [] = new int[row][column];
		
		System.out.println("Enter Values In Matrix  A");
		for(int i = 0; i < row; i++ ) {
			for(int j = 0; j < column; j++ ) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Values In Matrix  B");
		for(int i = 0; i < row; i++ ) {
			for(int j = 0; j < column; j++ ) {
				b[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < row; i++ ) {
			for(int j = 0; j < column; j++ ) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Sum Of Matrix A and B is :");
		for(int i = 0; i < row; i++ ) {
			for(int j = 0; j < column; j++ ) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
