/**
 * 
 */
package basicsCLB.Question14.javadocExercise;

/**
 * The method overloading in CommentDocumentation class
 */
public class CommentDocumentation {
	/**
	 * the main method
	 * @param args			//the main method has parameter called args
	 */
	public static void main(String[] args) {
		CommentDocumentation cd = new CommentDocumentation();
		System.out.println(cd.add(1, 2));
		System.out.println(cd.add(1, 2,3));
		System.out.println(cd.add("Hello ", "World"));
	}
	/**
	 * this add method will sum up two integers
	 * @param a the first integer
	 * @param b the second integer
	 * @return the sum of a and b
	 */
	public int add(int a, int b) {
		return a+b;
	}
	/*
	 * this is regular blockStyle comment
	 * this is the add method that takes 3 integers!
	 */
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	/**
	 * add up two strings 
	 * @param a first string
	 * @param b 2nd string
	 * @return the two strings combined
	 */
	public String add(String a, String b) {
		return a+b;
	}
}
