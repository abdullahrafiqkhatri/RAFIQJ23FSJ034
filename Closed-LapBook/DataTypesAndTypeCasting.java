package basicsCLB;

public class DataTypesAndTypeCasting {
	public static void main(String[] args) {
		
		//byte initialization
		byte byte1 = 50;
		byte byte2 = 100;
		
		//short
		short short1 = 2500;
		short short2 = 3698;
		
		//int
		int int1 = 369898989;
		int int2 = 2147483647;
		
		//long
		// if not given L gives error 'The literal 989766532779898 of type int is out of range ;
		long long1 = 989766532779898L; 
		long long2 = 852369775;
		
		// float
        float float1 = 3.14f;
        float float2 = 2.71828f;

        // double
        //here d is optional
        double double1 = 1.23456789656563d;
        double double2 = 9.8766554321;

        // char
        char char1 = 'A';
        char char2 = 'B';

        // boolean
        boolean booleanVar1 = true;
        boolean booleanVar2 = false;

        // Implicit type casting examples
        int implicitIntType = byte1; 
        int implicitIntType2 = short1;
        float implicitFloatType = int1; 
        double implicitDoubleType = float1;
        
        // Explicit type casting examples
        byte explicitByteType = (byte) int1;
        int explicitIntType2 =(int) double1;
        short explicitShortType = (short) int1;
        float explicitDoubleType = (float) double2;
	}
}
