package basicsOLB;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length ");
		double length = scan.nextDouble();
		
		System.out.println("Enter the width ");
		double width = scan.nextDouble();
		
		double area = length*width;
		System.out.println("Area of Rectangle is: "+area);		
	}
}
