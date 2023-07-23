package basicsOLB;

import java.util.Scanner;

public class ReversingNumber {
	public static void main(String[] args) {
		int num=0, reverseNum=0;
		
		System.out.println("Enter the number: ");
		
		Scanner scan= new Scanner(System.in);
		num=scan.nextInt();
		
		while(num != 0) {
			reverseNum *= 10;
			reverseNum += num%10;
			num /= 10;
		}
		System.out.println("Reverse of entered number is: "+reverseNum);
	}
}
