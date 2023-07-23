package basicsOLB;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int number, sum=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter any integer Value below 10: ");
		number = scan.nextInt();
		
		while(number<=10) {
			sum=sum+number;
			number++;
		}
		System.out.println("sum of the numbers from the whille loop is: "+sum);
	}
}
