package basicsCLB;

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
