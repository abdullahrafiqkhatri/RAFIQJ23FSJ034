package basicsCLB;
/* 
 * Right click on file or on screen select run as -> run configuration ->  go to argument section 
 * -> You can provide the arguments separated by spaces. ->For example, 
 * if you provide the following command-line arguments: "hello world 123", 
 * the output will be:
 * Argument 1: hello
 * Argument 2: a
 * Argument 3: world
 * Argument 4: 123
 */
public class CommandLineArgument {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("No comand-line arguments");
		} else {
			System.out.println("Command-line argument: ");
			for(int i=0;i<args.length;i++) {
				System.out.println("Argument "+(i+1)+": "+args[i]);
			}
		}
		System.out.println(args.length);
	}
}
