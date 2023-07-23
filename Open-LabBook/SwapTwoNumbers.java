package basicsOLB;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		float first = 3.34f, second = 5.59f;
		System.out.println("--Before swap--\n"+
				"First number - "+ first + 
				"\nSecond number - "+second);
		
		float temp;
		
		//swapping-->
		temp = first;
		first = second;
		second = temp;
		
		System.out.println("--After swap--\n"+
				"First number - "+ first + 
				"\nSecond number - "+second);
	}
}
