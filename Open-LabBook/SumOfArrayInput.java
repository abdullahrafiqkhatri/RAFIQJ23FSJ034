package basicsOLB;

import java.util.Scanner;

public class SumOfArrayInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] userArray = new int[10];
		int sum=0;
		
		System.out.println("Enter the elements: ");
		for(int element=0;element<10;element++) {
			userArray[element] = scanner.nextInt(); 
		}
		System.out.println("Entered elements are: ");
		for(int element : userArray) {
			System.out.print(element+" ");
		}
		for(int element : userArray) {
			sum += element;
		}
		System.out.println();
		System.out.println("The sum is: "+sum);
	}
}
