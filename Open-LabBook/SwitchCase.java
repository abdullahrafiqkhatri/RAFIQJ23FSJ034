package basicsOLB;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the digit to know the respected tech belongs to it: ");
		int tech = scan.nextInt();
		switch(tech) {
			case 1:
				System.out.println("java");
				break;
			
			case 2:
				System.out.println("python");
				break;
			
			default:
				System.out.println("Not Listed...");
		}
	}
}
