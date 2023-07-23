package basicsOLB;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println("Entered number is even");
		}else {
			System.out.println("Entered number is odd");
		}
	}
}
