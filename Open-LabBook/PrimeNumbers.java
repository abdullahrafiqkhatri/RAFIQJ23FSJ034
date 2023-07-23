package basicsOLB;

public class PrimeNumbers {
	/*
	 * The number which is only divisible by itself and 1 is known as prime number. 
		For example 2, 3, 5, 7…are prime numbers.
	*/
	
	public static void main(String[] args) {
		String primeNumbers = "";
		for(int i=1;i<=100;i++) {
			int counter =0;
			for(int j=i;j<=1;j--) {
				if(i%j==0) {
					counter ++;
				}
			}
			if(counter ==2) {
				primeNumbers += i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are: \n"+primeNumbers);
	}
}
