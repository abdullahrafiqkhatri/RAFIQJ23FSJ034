package basicsOLB;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the side of the square ");
		double side = scan.nextDouble();
		
		double area = Math.pow(side, 2);
		System.out.println("Area of Square is: "+area);
	}
}
