package basicsOLB;

import java.util.Scanner;

public class NestedSwitchCase {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the digit to know the respected tech belongs to it: ");
		int tech = scan.nextInt();
		switch(tech) {
			case 1:{
				System.out.println("java");
				break;
			}
			case 2:{
				System.out.println("python");
				System.out.println("Enter the course :");
				int course = scan.nextInt();
				
				switch(course) {
					case 1:
						System.out.println("Hello World");
						break;
					case 2:
						System.out.println("Functions");
						break;
					default:
						System.out.println("Not listed...");
				}
				break;
			}
			default:{
				System.out.println("Not Listed...");
			}
		}
	}
}
