
package basicsCLB.Question15;

public class checkPrime {
	public static void main(String[] args) {
		generatePrime();
		
	}
	public static void generatePrime() {
		
		for(int i=2; i<=100; i++) {
			int counter=0;
			for(int j=1; j<=i;j++) {
				if(i%j==0) {
					counter++;
				}
			}
			if(counter==2) {
				System.out.print(i+" ");
			}
		}
	}
}
