package by.epam.tr.main;

import java.util.Scanner;

public class Exersise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a>");
		double a = sc.nextInt();
		System.out.println("Enter number b>");
		double b = sc.nextInt();
		System.out.println("Enter number h>");
		double h = sc.nextInt();
		sc.close();
		
		function(a, b, h);
		
		
	}

	public static void function(double a, double b, double h){
		double y;
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for(double x = a; x<=b; x=x+h){
			y = (1-Math.cos(2*x))/2 - Math.cos(2*x);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");

	}
}
