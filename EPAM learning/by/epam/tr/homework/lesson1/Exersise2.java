package by.epam.tr.main;

import java.util.Scanner;

public class Exersise2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number a>");
		double a = sc.nextDouble();
		System.out.println("Enter the number b>");
		double b = sc.nextDouble();
		System.out.println("Enter the number c>");
		double c = sc.nextDouble();
		sc.close();
		System.out.print("The result of calculating the equation is: " + equation(a,b,c));
		
	}
	public static double equation(double a, double b, double c){
		double result = (b+Math.sqrt(Math.pow(b, 2)+4*a*c))/2*a-Math.pow(a, 3)*c+Math.pow(b, -2);
		double denom = 2*a;
		
		if(denom!=0){
			return result;
		} else{
			System.out.println("The denominator is zero.");
			result = Double.NaN;
			return result;
		}
	}
}