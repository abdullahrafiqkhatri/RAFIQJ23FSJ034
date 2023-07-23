package basicsOLB;
import java.util.Scanner;
public class PrintANumber {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		System.out.println("You entered: "+number);
	}
}
