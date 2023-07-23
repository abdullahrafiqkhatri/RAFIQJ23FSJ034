package basicsOLB;

public class CastingExercise {
	public static void main(String[] args) {
		byte b = 10;
		int i=b; // this is accepted bcz-  automatic type promotion
		// byte c = i; // this is not accepted bcz  lower type cannot be put in higher
		byte d = (byte) i; //<--------------- type casting
		byte x=10, y=20;
		
		//byte sum = x*y;
		
		/*
		 * Error - "Type mismatch: cannot convert from int to byte"
		   Error is thrown because when two bytes are used in a 
		   arithmetic operation, the result will be integer
		*/
		
		int sum = x*y;
		System.out.println(sum);
		
	}
}
