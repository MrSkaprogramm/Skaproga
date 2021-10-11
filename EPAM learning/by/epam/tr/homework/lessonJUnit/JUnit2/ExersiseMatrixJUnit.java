package by.epam.tr.main;

import java.util.Scanner;

public class ExersiseMatrixJUnit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array>");
		int n = sc.nextInt();
		sc.close();
		Array(n);
	}
		
	public static void Array(int n){
		int[] mas = new int[n];
		
		System.out.println("Your array>");
		for(int i = 0; i < mas.length; i++){
			mas [i] = (int)(Math.random()*n + 1);
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		Printmatrix(n, mas);
	}
		
	public static int[][] Printmatrix(int n, int mas[]){
		int[][] matrix = new int[n][n];
		System.out.print("Your matrix>");
		for(int line = 0; line < matrix.length; line++){
			System.out.println();
			for(int column = 0; column < matrix[line].length; column++){
					matrix[line][column] = (int)(Math.pow(mas[column], line));
					System.out.print(matrix[line][column] + " ");
			}
		}
		return matrix;
	}
}
