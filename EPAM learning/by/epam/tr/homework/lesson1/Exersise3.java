package by.epam.tr.main;

import java.util.Scanner;

public class Exersise3 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter leg length a>");
		double a = sc.nextDouble();
		System.out.println("Enter leg length b>");
		double b = sc.nextDouble();
		sc.close();
		
		System.out.println("The perimeter is: "+ P(a,b));
		System.out.print("The area is: "+ S(a,b));

	}
	
	public static double S (double a, double b){
		return a + b + Math.sqrt(Math.pow(a,2.0)+Math.pow(b,2.0));
	}
	
	public static double P (double a, double b){
		return (a*b)/2;
	}
}
		
