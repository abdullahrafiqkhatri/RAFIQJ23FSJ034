package basicsOLB;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius ");
		double radius = scan.nextDouble();
		
		double area = Math.PI*Math.pow(radius, 2);
		System.out.println("Area of Circle is: "+area);
		
		double circumference= 2*Math.PI*radius;
		System.out.println("The circumference of Circle is: "+circumference);
	}
}
