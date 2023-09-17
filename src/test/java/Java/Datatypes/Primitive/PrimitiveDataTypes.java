package Java.Datatypes.Primitive;

public class PrimitiveDataTypes {
	
	public static void main(String[] args) {
		
		//8 Primitive DataTypes
		byte v_byte = 126;				//	1 byte:		Stores whole numbers from -128 to 127
		short v_short = 30000;			//	2 bytes:	Stores whole numbers from -32,768 to 32,767	
		int v_int = 100000;				// 	4 bytes:	Stores whole numbers from -2,147,483,648 to 2,147,483,647
		long v_long = 15000000000L;		// 	8 bytes:	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float v_float = 5.75f;			// 	4 bytes:	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		double v_double = 19.99d;		//	8 bytes:	Stores fractional numbers. Sufficient for storing 15 decimal digits
		boolean v_boolean = true;		//	1 bit:		Stores true or false values
		char v_char = 'S';				//	2 bytes:	Stores a single character/letter or ASCII values
		
		System.out.println("byte value is: " + v_byte);
		System.out.println("short value is: " + v_short);
		System.out.println("int value is: " + v_int);
		System.out.println("long value is: " + v_long);
		System.out.println("float value is: " + v_float);
		System.out.println("double value is: " + v_double);
		System.out.println("boolean value is: " + v_boolean);
		System.out.println("char value is: " + v_char);
		
		System.out.println("-------------------------------------");
		System.out.println("DataType: char");
		char myVar1 = 33, myVar2 = 34, myVar3 = 47;
		System.out.println("char values (33, 34, 47):\t" + myVar1 + " | " + myVar2 + " | " + myVar3);
		char myVar4 = 48, myVar5 = 49, myVar6 = 57;
		System.out.println("char values (48, 49, 57):\t" + myVar4 + " | " + myVar5 + " | " + myVar6);
		char myVar7 = 58, myVar8 = 59, myVar9 = 64;
		System.out.println("char values (59, 59, 64):\t" + myVar7 + " | " + myVar8 + " | " + myVar9);
		char myVar10 = 65, myVar11 = 66, myVar12 = 90;
		System.out.println("char values (65, 66, 90):\t" + myVar10 + " | " + myVar11 + " | " + myVar12);
		char myVar13 = 91, myVar14 = 92, myVar15 = 96;
		System.out.println("char values (91, 92, 96):\t" + myVar13 + " | " + myVar14 + " | " + myVar15);
		char myVar16 = 97, myVar17 = 98, myVar18 = 122;
		System.out.println("char values (97, 98, 122):\t" + myVar16 + " | " + myVar17 + " | " + myVar18);
		char myVar19 = 123, myVar20 = 124, myVar21 = 126;
		System.out.println("char values (123, 124, 126):\t" + myVar19 + " | " + myVar20 + " | " + myVar21);
	
//		for(int i=1; i<=32; i++) {
//			char value = (char) i; 
//			System.out.print(value + " | ");
//		}
		
		char myVar22 = 20000;
		System.out.println("char value (20000):\t\t" + myVar22);
		
	}
}
