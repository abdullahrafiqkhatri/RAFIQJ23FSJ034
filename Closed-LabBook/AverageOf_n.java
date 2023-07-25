package basicsCLB;

import java.util.Scanner;

public class AverageOf_n {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length:");
		int length = scanner.nextInt();
		int[] inputNumbers = new int[length];
		
		System.out.println("Enter the elements:");
		for(int element=0; element<length;element++) {
			inputNumbers[element] = scanner.nextInt();
		}
		
		AverageOf_n obj = new AverageOf_n();
		double result= obj.avgCalc(inputNumbers);
		System.out.println(result);
		
	}
	
	public double avgCalc(int[] numbers) {
		int sum =0 ;
		for(int num: numbers) {
			sum += num;
		}
		double average = (double)sum/numbers.length;
		return average;
	}
}
