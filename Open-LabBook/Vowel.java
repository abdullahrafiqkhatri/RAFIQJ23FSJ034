package basicsOLB;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the albhabet: ");
		char ch = scan.next().charAt(0); //googled how to scan char 
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel");
		} else {
			System.out.println(ch + " is consonent");
		}
		
	}
}
