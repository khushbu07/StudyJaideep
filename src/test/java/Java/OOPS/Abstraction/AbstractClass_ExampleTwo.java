package Java.OOPS.Abstraction;

abstract class Shape {										//Parent Abstract Class

	String color;

	abstract double area();									// Abstract class: Abstract Method
	public abstract String toString();						// Abstract class: Abstract Method

	public Shape(String color) {							// Abstract class: Constructor
		System.out.println("Parent-Class (Shape) Constructor Called");
		this.color = color;
	}

	public String getColor(){								//Abstract class: Non-Abstract Method 								
		return color; 
	}
}

class Circle extends Shape {								//Sub Class extending Abstract Class

	double radius;

	public Circle(String color, double radius)	{						// Sub Class Constructor
		super(color);													// Calling Parent Class Constructor
		System.out.println("Sub-Class (Circle) Constructor Called");
		this.radius = radius;
	}

	//Overriding the Abstract Methods of Parent Class
	@Override double area()	{
		return Math.PI * Math.pow(radius, 2);
	}
	@Override public String toString() {
		return "Circle Color: " + super.getColor() + " | Area: " + area();
	}
}

class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(String color, double length, double width)	{		// Sub Class Constructor
		super(color);													// Calling Parent Class Constructor
		System.out.println("Sub-Class (Rectangle) Constructor Called");	// 
		this.length = length;
		this.width = width;
	}

	//Overriding the Abstract Methods of Parent Class
	@Override double area() {
		return length * width; 
	}
	@Override public String toString() {
		return "Rectangle Color: " + super.getColor() + " | Area: " + area();
	}
}


public class AbstractClass_ExampleTwo {

	public static void main(String[] args)	{
		
		Shape circle = new Circle("Red", 2.2);
		Shape rectangle = new Rectangle("Yellow", 2, 4);

		System.out.println(circle.toString());
		System.out.println(rectangle.toString());
	}
}
