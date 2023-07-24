package basicsCLB;

import java.util.Arrays;

public class ReverseElements {
	public static void main(String[] args) {
		int[] arr = {65, 44, 2, 1, 85, 37, -1, -6, -63, 50, 27, 6};
		ReverseElements obj = new ReverseElements();
		obj.reverseElement(arr);
	}
	public void reverseElement(int[] array){
		int temp;
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				temp = array[i];
				array[i] = array[j]; 
				array[j] = temp;
			}
			
		}
		System.out.println(Arrays.toString(array));
	}
}
