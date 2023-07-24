package basicsCLB;

import java.util.Scanner;

public class ArrayLocationFinder {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);

		int[] arr = {65, 44, 2, 1, 85, 37, -1, -6, -63, 50, 27, 6};  
		ArrayLocationFinder obj = new ArrayLocationFinder();
		obj.finder(arr);
	}
	
	public void finder(int[] array) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the element to find from the given array \n"
				+ "[65, 44, 2, 1, 85, 37, -1, -6, -63, 50, 27, 6]:");
		int searchElement = scanner.nextInt();
		int counter = -1;
		boolean isFound = false;
		for(int element : array) {
			if(searchElement == element) {
				counter++;
				isFound = true;
				break;
			} else {
				counter++;
			}
		}
		if(isFound) {
			System.out.println("Found the "+ searchElement +" at index "+counter);
		} else {
			System.out.println(searchElement+" was not found");
		}
	}
}
