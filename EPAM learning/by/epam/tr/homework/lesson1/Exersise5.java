package by.epam.tr.main;

import java.util.Scanner;

public class Exersise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a>");
		int a = sc.nextInt();
		System.out.println("Enter number b>");
		int b = sc.nextInt();
		System.out.println("Enter number c>");
		int c = sc.nextInt();
		sc.close();
		System.out.println(exponentiation(a,b,c));
	}
		
		
	public static String exponentiation(int a, int b, int c){
		if(a>=0){
			a = (int) Math.pow(a, 2);
		} else{
			a = (int) Math.pow(a, 4);
		}
		if(b>=0){
			b = (int) Math.pow(b, 2);
		} else{
			b = (int) Math.pow(b, 4);
		}
		if(c>=0){
			c = (int) Math.pow(c, 2);
		} else{
			c = (int) Math.pow(c, 4);
		}
		return "The result of variable a: " + a + "\nThe result of variable b: " + b + "\nThe result of variable c: " + c;

	}

}
