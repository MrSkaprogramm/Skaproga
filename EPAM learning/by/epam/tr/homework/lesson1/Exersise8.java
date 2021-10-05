package by.epam.tr.main;

import java.util.Scanner;

public class Exersise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array elements n>");
		int N = sc.nextInt();
		System.out.println("Enter divisor K>");
		int K = sc.nextInt();
		sc.close();
		
		int[] chisla = new int[N];
		
		for(int i = 0; i<chisla.length; i++){
			chisla[i] = (int)(Math.random()*(N) + 1);
			System.out.print(chisla[i] + " ");
			}
			System.out.println();
			
		System.out.print("The sum of the numbers is " + Plus(chisla, K));
	}
	public static int Plus(int chisla[], int K){
		int sum = 0;
		for(int i = 0; i<chisla.length; i++){
			if(chisla[i] % K == 0){
				sum = sum+chisla[i];
			}
		}
		return sum;
	}
}
