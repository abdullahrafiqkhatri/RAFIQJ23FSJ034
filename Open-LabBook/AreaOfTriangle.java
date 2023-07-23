package basicsOLB;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the base ");
		double base = scan.nextDouble();
		
		System.out.println("Enter the height ");
		double height = scan.nextDouble();
		
		double area = 0.5*base*height;
		System.out.println("Area of Triangle is: "+area);
	}
}
