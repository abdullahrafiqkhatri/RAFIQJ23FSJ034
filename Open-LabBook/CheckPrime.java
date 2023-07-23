package basicsOLB;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number to check if it is prime or not: ");
		int number = scan.nextInt();
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(number+" is a Prime Number");
		} else {
			System.out.println(number+" is not a Prime Number");
	
		}
	}
}
