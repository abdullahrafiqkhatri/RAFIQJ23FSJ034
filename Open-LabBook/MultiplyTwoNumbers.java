package basicsOLB;

import java.util.Scanner;

public class MultiplyTwoNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first = scan.nextInt();
		System.out.println("Enter the second number: ");
		int second = scan.nextInt();
		System.out.println("The multiplication of given number is: "+(first*second));
	}
}
