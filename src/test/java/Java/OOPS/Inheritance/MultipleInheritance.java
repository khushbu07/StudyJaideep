package Java.OOPS.Inheritance;

/*
 * Multiple Inheritance can only be achieved by implementing multiple interfaces.
 * As a class can not extends to multiple classes.
 * 
 * Diamond Problem in Java?
 * Explanation: 
 * 		1) Suppose there is a class "A" having one method called "printInfo".
 * 		2) Two more classes, "B" & "C", extends to "A" and are having/overriding the same method "printInfo".
 * 		3) Suppose there is one more class called "D" which extends to both "B" & "C"  -  [This is not a possible scenario.]
 * 		4) When we try to call the "printInfo" method by creating the object of class D, the compiler will get confused.  
 * 
 */

// Interface 1
interface interfaceOne {
    default void show() {									//Default Method
        System.out.println("Default PI1");
    }
}
 
// Interface 2
interface interfaceTwo {
    default void show() {									//Default Method
        System.out.println("Default PI2");
    }
}

public class MultipleInheritance implements interfaceOne, interfaceTwo{
	
    public void show()  {											// Overriding default show method
    	interfaceOne.super.show();									// Calling "show" method of P
        interfaceTwo.super.show();
    }
	
	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.show();
	}
}
