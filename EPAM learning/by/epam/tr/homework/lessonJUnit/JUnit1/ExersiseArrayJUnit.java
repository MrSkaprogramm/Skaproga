package by.epam.tr.main;

import java.util.Scanner;

public class ExersiseArrayJUnit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter even number of array elements>");
		int n = sc.nextInt();
		sc.close();
		Array(n);
	}	
	public static void Array(int n){
		int[] mas = new int[n];
		
		System.out.println("Your array>");
		for(int i = 0; i < mas.length; i++){
		mas[i] = (int)(Math.random()*n + 1);
		System.out.print(mas[i]);
		}
		System.out.println();
		System.out.println("Your array without second digits>");
		
		newArray(mas);
	}
	public static void newArray(int[] mas){
		for(int x = 0; x < mas.length; x++){
			if(((x + 1)%2 == 0)&&(x > 0)){
				mas[x] = 0;
				}
			System.out.print(mas[x]);
			}
		}
}
