/**
 * 
 */
package basicsCLB;
import java.util.ArrayList;
/**
 * 
 */
public class ElementFinderAndi_tsCount {
	public static void main(String[] args) {
		int[] array = {50,60,7,9,60,35,6,60};
		ElementFinderAndi_tsCount obj = new ElementFinderAndi_tsCount();
		int number = 60;
		ArrayList<Integer> gotAnswer = obj.locationAndCountFinder(array, number);
		String locationString="";
		if(gotAnswer.size()<0) {
			System.out.println("Couldn't Found");
		} else {
			for(int element : gotAnswer) {
				
				if(gotAnswer.size()<1) {
					System.out.println(number+" found only once at "+element);
				} else {
					locationString += element+" ";
				}
			}
			System.out.println(number+" was found "+gotAnswer.size()+" times at "+locationString);
		}
		
	}
	public ArrayList<Integer> locationAndCountFinder(int[] array,int number) {
		ArrayList<Integer> foundLocation = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			if(number==array[i]) {
				foundLocation.add(i);
			}
		}
		return foundLocation;
	}
}
