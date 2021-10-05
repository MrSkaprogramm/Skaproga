package by.epam.tr.main;

import java.util.Scanner;

public class Exersise1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to compare> ");
		int n = sc.nextInt();
		sc.close();
		System.out.print("Comparison result: " + comparsion(n));
	}
	public static boolean comparsion(int n) {
		int n_part1 = (int)((n/(Math.pow(10, 3))%10)) + (int)((n/(Math.pow(10, 2))%10));
		int n_part2 = (int)((n/(Math.pow(10, 1))%10)) + (int)((n/(Math.pow(10, 0))%10));
	
			if(n_part1 == n_part2){
				return true;
			} else{
				return false;
		}
	}
}