package basicsCLB;

public class CheckPrime {
	public static void main(String[] args) {
		int number = 7;
		int counter = 0;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				counter++;
				break;
			}
		}
		if(counter == 0) {
			System.out.println(number+" is a Prime number");
		} else {
			System.out.println(number+" not a Prime number");
		}
	}
}
