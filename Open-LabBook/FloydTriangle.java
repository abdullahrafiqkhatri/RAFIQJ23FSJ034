package basicsOLB;

import java.util.Scanner;

public class FloydTriangle {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int rows,counter,j,number=1;
		
		System.out.println("Enter the number of rows for floyd's triangle: ");
		rows=scan.nextInt();
		System.out.println("--Floyd Traingle--");
		
		for(counter=1;counter<=rows;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
}
