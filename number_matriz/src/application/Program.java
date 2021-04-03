package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("lines: ");
		int m = sc.nextInt();
		System.out.print("Colums: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++) {
			for (int j=0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Type a number to search the matrix: ");
		int number = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == number) {
					System.out.printf("Position: %d, %d%n", i, j);
					if(j > 0)
						System.out.printf("Left: %d%n", mat[i][j-1]);
					if(j < mat[i].length - 1)
						System.out.printf("Right: %d%n", mat[i][j+1]);
					if(i > 0)
						System.out.printf("Up: %d%n", mat[i-1][j]);
					if(i < mat.length-1)
						System.out.printf("Down: %d%n", mat[i+1][j]);
				}
			}
		}
		
		sc.close();
	}
}