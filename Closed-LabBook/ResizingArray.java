package basicsCLB;

import java.util.Arrays;
import java.util.Scanner;

public class ResizingArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] array = {11,22,33,44,55};
		int[] newArray;
		System.out.println("Do you want to increase the size of array or to decrease?\n"
							+"inc - to increase / dec - to decrease");
		switch(scanner.nextLine().toLowerCase()) {
			case "inc":
				System.out.println("Enter the no. of length you want to add:");
				int additionalLength = scanner.nextInt();
				if(additionalLength>0) {
					newArray = new int[array.length + additionalLength];
					System.arraycopy(array,0,newArray,0,array.length);  //googled how to copy array source without using loop
					System.out.println("Resized Array :" + Arrays.toString(newArray)); //also googled
				} else {
					System.out.println("No changes were made");
				}
				break;
			case "dec":
				System.out.println("Enter the no. of length you want to add:");
				int deductingLength = scanner.nextInt();
				if(deductingLength>0 && deductingLength<=array.length) {
					newArray = new int[array.length - deductingLength];
					System.arraycopy(array,0,newArray,0,newArray.length);  
					System.out.println("Resized Array :" + Arrays.toString(newArray));
				} else {
					System.out.println("No changes were made");
				}
				break;
			default:
				System.out.println("No changes were made!");
		}
	}
}
