package by.epam.tr.main;

import java.util.Scanner;

public class Exersise10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Enter even number of array elements>");
			n = sc.nextInt();	
		}while(n % 2 != 0 || n == 0);
		sc.close();
		
		int[][] matrix = new int[n][n];
		
		System.out.println("The result array is:");
		matrixPrint(matrix, n);
	}
		
	public static void matrixPrint(int[][] matrix, int n){
		for(int line = 0; line < n; line++){
			if(line%2 == 0){
				int cell_digit = n;
				
				for(int column = 0; column < n; column++){
						matrix[line][column] = cell_digit;
						cell_digit--;} 
					} 
			else{
				 int cell_digit = 1;
					
				 for(int column = 0; column < n; column++){
						 matrix[line][column] = cell_digit;
						 cell_digit++;}
					}
				}
		for(int line = 0; line < n; line++){
			for(int column = 0; column < n; column++){
				System.out.print(matrix[line][column]+" ");
			}
			System.out.println();
		}
	}
}
