package Java.OOPS.Abstraction;

/*
 * Interface is basically a blueprint of a class. 
 * It can have static constants and abstract methods.
 * Through Interface, we can achieve 100% Abstraction
 */


//Interface
interface myInterface
{
    final int a = 10;
    
    //Default Method(s)
    default void defaultMethodOne()
    {
        System.out.println("defaultMethodOne");
    }
    
    default void defaultMethodTwo()
    {
        System.out.println("defaultMethodTwo");
    }
    
    //Static Method(s)
    static void staticmethodOne()
    {
        System.out.println("staticmethodOne");
    }
    
    static void staticMethodTwo() {
    	System.out.println("staticMethodTwo");
    }
}

public class Interface_ExampleThree implements myInterface{

	
	public static void main(String[] args) {

		myInterface.staticmethodOne();									// Accessing static method directly
		myInterface.staticMethodTwo();
		
		Interface_ExampleThree objOne = new Interface_ExampleThree();	//Need to create an instant of class to access default method
		objOne.defaultMethodOne();
		objOne.defaultMethodTwo();
	}

}
