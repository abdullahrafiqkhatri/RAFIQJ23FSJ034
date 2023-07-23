package basicsOLB;

public class PrintASCII_value {
	public static void main(String[] args) {
		char ch = 'H';
		int ascii = ch;
		int castASCII = (int) ch;
		System.out.println("The ASCII value of "+ch+ " is: "+ascii);
		System.out.println("The ASCII value of "+ch+ " is: "+castASCII);
		ascii = 'K';
		System.out.println("The ASCII value of 'K' is: "+ascii);
	}
}
