package by.epam.tr.main;

import java.util.Scanner;

public class Exersise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a>");
		double a = sc.nextInt();
		System.out.println("Enter number b>");
		double b = sc.nextInt();
		System.out.println("Enter number c>");
		double c = sc.nextInt();
		sc.close();
		System.out.println("The sum is: " + Sum(a,b,c));
	}
	
	public static double Sum(double a, double b, double c){
		double result;
		
		if((a>b)&&(b>c)){
			result = a + c;
		} else if((a>b)&&(b<c)){
			result = a + b;
		} else{
			result = b + c;
		}
		return result;
	}
}
