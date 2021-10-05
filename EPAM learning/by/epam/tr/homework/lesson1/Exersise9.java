package by.epam.tr.main;

import java.util.Scanner;

public class Exersise9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array 1 elements>");
		int ar1_elem = sc.nextInt();
		System.out.println("Enter number of array 2 elements>");
		int ar2_elem = sc.nextInt();
		System.out.println("Specify Array Separator Number>");
		int k = sc.nextInt();
		sc.close();
		
		int[] firstArray = new int[ar1_elem];
		int[] secondArray = new int[ar2_elem];
		
		for(int i = 0;i<firstArray.length; i++) {
			firstArray[i] = (int)(Math.random()*(ar1_elem) + 1);
			System.out.print(firstArray[i] + " ");
		}
		System.out.println();
		
		for(int i = 0;i<secondArray.length; i++) {
			secondArray[i] = (int)(Math.random()*(ar2_elem) + 1);
			System.out.print(secondArray[i] + " ");
		}
		System.out.println("\n" + "The concatenated array is:");
		
		JoinAr(firstArray, secondArray, k);
	}

	public static void JoinAr(int[] firstArray, int[] secondArray, int k){
		int ar1_num = 0;
		int ar2_num = 0;
		
		int[] resultArray = new int[firstArray.length + secondArray.length];
		
		for(int i = 0; i<resultArray.length; i++){
			if(i<=k){
				resultArray[i] = firstArray[ar1_num];
				ar1_num++;
			} else if((i > k)&&(i<=k + secondArray.length)){
				resultArray[i] = secondArray[ar2_num];
				ar2_num++;
			} else{
				resultArray[i] = firstArray[ar1_num];
				ar1_num++;
			}
			System.out.print(resultArray[i] + ", ");
		}
	}
}
