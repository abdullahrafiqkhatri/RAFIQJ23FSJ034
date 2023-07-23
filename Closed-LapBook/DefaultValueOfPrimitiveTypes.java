package basicsCLB;

public class DefaultValueOfPrimitiveTypes {
	public static void main(String[] args) {
		byte defaultByte=0 ;
		short defaultShort=0;
		int defaultInt=0;
		long defaultLong=0;
		float defaultFloat=0; 
		double defaultDouble=0;
		char defaultChar='\u0000';
		boolean defaultBoolean=false;
		
		System.out.println("Default value of all primitive types:");
		System.out.println("byte: " + defaultByte);
        System.out.println("short: " + defaultShort);
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong);
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("char: " + defaultChar);
        System.out.println("boolean: " + defaultBoolean);
	}
}
