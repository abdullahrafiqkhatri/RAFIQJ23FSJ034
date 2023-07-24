package basicsCLB;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int[] arr = {65, 44, 2, 1, 85, 37, -1, -6, -63, 50, 27, 6};  
		
		SortingArray obj = new SortingArray();
		int[] result = obj.sortingDescending(arr);
		System.out.println(Arrays.toString(result)); 
		
		result = obj.sortingAscending(arr);
		System.out.println(Arrays.toString(result));
	}
	
	public int[] sortingAscending(int[] array) {
//		int[] newArray = new int[array.length];
//		System.arraycopy(array, 0, newArray, 0, array.length);
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				int temp = 0;
				if(array[i]>array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j]= temp;
				}
			}
		}
		
		return array;
	}
	
	public int[] sortingDescending(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				int temp = 0;
				if(array[i]<array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j]= temp;
				}
			}
		}
		
		return array;
	}
}
