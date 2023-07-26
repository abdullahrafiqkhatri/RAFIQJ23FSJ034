
package basicsCLB.Question15;

import java.util.Scanner;

public class WhatKindOfNumber {
	public static void main(String[] args) {
		WhatKindOfNumber obj = new WhatKindOfNumber();
		
//		for(int i=100;i<1000;i++) {
//			if(obj.checkArmStrong(i)) {
//				System.out.println(i);
//			}
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check if it's :\n"
				+ "a)ArmStrong Number\n"
				+ "b)Perfect Number\n"
				+ "c)Palindrome Number");
		int number = scanner.nextInt();
		if (obj.checkArmStrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else if (obj.checkPerfectNumber(number)) {
            System.out.println(number + " is a Perfect number.");
        } else if (obj.checkPalindrome(number)) {
            System.out.println(number + " is a Palindrome number.");
        } else {
            System.out.println(number + " is none of these.");
        }
		
			
	}
	public boolean checkArmStrong(int number) {
		
		if(number>10) {
			int originalNumber = number;
			int noOfDigit = 0, sum=0;
			while(originalNumber>0) {
				noOfDigit++;
				originalNumber /=10;
			}
			originalNumber=number;
			while(originalNumber>0) {
				int digit=originalNumber%10;
				sum += Math.pow(digit, noOfDigit);
				originalNumber /=10;
			}
			if(sum==number) {
				return true;
			} else {
				return false;
			}
		}
		return false;
		
		
		
	}
	
	public boolean checkPerfectNumber(int number) {
		int sum=0;
		for(int i=1;i<=number/2;i++) {
			if(number%i==0) {
				sum += i;
			}
		}
		if(sum==number) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkPalindrome(int number){
		int palindromeNumber = 0, originalNumber = number;
		while(number>0) {
			palindromeNumber += number%10;
			number /= 10;
			palindromeNumber *=10;
		}
		palindromeNumber/=10;
		if(palindromeNumber==originalNumber) {
			return true;
		} else {
			return false;
		}
	}
}
