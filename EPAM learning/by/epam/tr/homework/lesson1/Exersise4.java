package by.epam.tr.main;
import java.util.Scanner;

public class Exersise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coordinate x>");
		double x = sc.nextDouble();
		System.out.println("Enter the coordinate y>");
		double y = sc.nextDouble();
		sc.close();
		
		System.out.println(function(x,y));
	}
		
		public static boolean function(double x, double y){
			if(y >= 0 && y <= 4 && x >= -2 && x <= 2){
				return true;
			} else if(y <= 0 && y >= -3 && x >= -4 && x <= 4){
				return true;
			} else{
				return false;
			}
	}

}
